/*
 * Copyright (c) 2020. ultimasolution.pl
 */

import lombok.Data;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
/**
 * projekt:  hackerrank
 * pakckage: PACKAGE_NAME
 * autor:    karol
 * data:     2/3/2020
 * <p>
 * description:
 * Test data read from CSV file and compare.
 * <p>
 * problems solved in this exercises:
 * 1. set recources folder for test data: for example, right click on the folder and then select Build Path -> Use as Source Folder. https://github.com/junit-team/junit5/issues/1327
 **/


@DisplayName("Input file data call JavaDataType and compare to output file")
class JavaDatatypesTest {
//    final ByteArrayOutputStream out = new ByteArrayOutputStream();
//    PrintStream save_out=System.out;

//    @Before
//    public void setUpStreams() {
//        PrintStream save_out=System.out;
//    }
//
//    @After
//    public void restoreStreams() {
//        System.setOut(save_out);
//    }

    @DisplayName("Send input from DataTypesInput output form DataTypesResults")
    @ParameterizedTest
    @CsvFileSource(resources = "DataTypesInput.csv", numLinesToSkip = 0)
    void checkData(String input) throws IOException {
        // System.setOut(new PrintStream(out));
        JavaDataType.checkDataType(Long.parseLong(input));
        assertEquals(findTestDataList(input), "");
    }

//    @Test
//    void it_prints_out() {
//        //System.setOut(new PrintStream(out));
//        System.out.println("Hello World!");
//        assertEquals("Hello World!\r\n", out.toString());
//    }

    @Test
    void checkOneData() throws IOException {
        //System.setOut(new PrintStream(out));
        JavaDataType.checkDataType(-127L);
        System.out.println(findTestDataList("-127"));
        assertEquals(findTestDataList("-127"), "");
    }


    public @Data class TestData implements Comparable<TestData> {
        private long InputLong;
        private String TestData;

        public TestData() {
        }

        public TestData(Long inputLong, String testData) {
            this.InputLong = inputLong;
            this.TestData = testData;
        }

        public int compareTo(TestData another) {
            return (int)(this.InputLong - another.gettestData());
        }

        private long gettestData() {
            return this.InputLong;
        }

        public String toString() {
            return this.InputLong + " " + this.TestData;
        }
    }
    /**
     * 1. read data to List<String> listStringCSV
     * 2. find line started specific int
     * 3. read until next line "fitted"
     * 4. return this string
     *
     * @param input
     * @return
     */
    public String findTestDataList(String input) throws IOException {
        String path = "src/test/resources/DataTypesResults.csv";
        Charset encoding = Charset.defaultCharset();
        List<String> listStringCSV = Files.readAllLines(Paths.get(path), encoding);
        TestData td = new TestData();
        ArrayList<StringBuilder> slOutputList = new ArrayList<>();
        StringBuilder sOutput = new StringBuilder("");
        boolean start = false;
        System.out.println("start scan : " + path);
        System.out.println(slOutputList);
        for(String sLine : listStringCSV){
            start = sLine.contains("fitted") != start;
            //                Scanner sc = new Scanner(sLine);
            //                sc.findInLine("(-?\\d+)");
            //                MatchResult result = sc.match();
            //                long lparse = Long.parseLong(result.group(1));
            if(start) {
                sOutput.append(sLine);
            } else {
                slOutputList.add(sOutput);
                sOutput.delete(0,  sOutput.length());
                sOutput.append(sLine);
                start = true;
            }
        }
        System.out.println("slOutputList: " + slOutputList);
        return sOutput.toString();
    }
}
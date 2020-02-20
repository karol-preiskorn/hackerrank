/*
 * Copyright (c) 2020. ultimasolution.pl
 */

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
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
    final ByteArrayOutputStream out = new ByteArrayOutputStream();
    PrintStream save_out=System.out;

    @Before
    public void setUpStreams() {
        PrintStream save_out=System.out;
    }

    @After
    public void restoreStreams() {
        System.setOut(save_out);
    }

    @DisplayName("Send input from DataTypesInput output form DataTypesResults")
    @ParameterizedTest
    @CsvFileSource(resources = "/src/test/resources/DataTypesInput.csv", numLinesToSkip = 0)
    void checkData(String input) throws IOException {
        System.setOut(new PrintStream(out));
        JavaDataType.checkDataType(Long.parseLong(input));
        assertEquals(findTestDataList(input), "");
    }

    @Test
    void it_prints_out() {
        System.setOut(new PrintStream(out));
        System.out.println("Hello World!");
        assertEquals("Hello World!\r\n", out.toString());
    }

    /**
     * 1. read data to table
     * 2. find and analyse data in table
     * - find specyfic int
     * - read some line to next int
     *
     * @param input
     * @return
     */
    public String findTestDataList(String input) throws IOException {
        String path = "src/test/resources/DataTypesResults.csv";
        Charset encoding = Charset.defaultCharset();
        List<String> listStringCSV = Files.readAllLines(Paths.get(path), encoding);
        ArrayList<String> slOutputList = new ArrayList<String>();
        String sOutput = new String();
        boolean start = false;
        for(String sLine : listStringCSV){
            start = sLine.contains(input) != start;
            //                Scanner sc = new Scanner(sLine);
            //                sc.findInLine("(-?\\d+)");
            //                MatchResult result = sc.match();
            //                long lparse = Long.parseLong(result.group(1));
            if(start) sOutput = sOutput + sLine;
        }
        System.out.println("sOutput: " + sOutput);
        return sOutput;
    }
}
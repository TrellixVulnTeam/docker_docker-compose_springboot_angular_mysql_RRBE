package com.tma.apistudentmanagement;

import com.tma.apistudentmanagement.utils.DateTimeUtil;
import lombok.SneakyThrows;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.stream.Stream;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DateTimeTest {

//    @ParameterizedTest(name = "#{index} - Run test with date = {0}")
//    @MethodSource("validDateProvider")
//    void test_date_java_api_valid(String date) {
//        assertTrue(DateTimeUtil.isValid(date));
//    }
//
//    @ParameterizedTest(name = "#{index} - Run test with date = {0}")
//    @MethodSource("invalidDateProvider")
//    void test_date_java_api_invalid(String date) {
//        assertFalse(DateTimeUtil.isValid(date));
//    }
//
//    static Stream<String> validDateProvider() {
//        return Stream.of(
//                "09/30/1990",
//                "09/30/1998",
//                "09/01/1990",
//                "09/01/2020",
//                "9/1/2020",
//                "09/1/2020",
//                "02/29/2020",             // leap year
//                "02/28/2020",             // leap year
//                "2/28/2020",             // common year
//                "2/29/2020",            // 2000 is a leap year, % 400 == 0
//                "02/28/1900",            // 1900 is a common year
//                "07/31/2020",
//                "08/31/2020",
//                "06/20/2020",
//                "01/01/1900",
//                "30/12/2020");
//    }
//
//    static Stream<String> invalidDateProvider() {
//        return Stream.of(
//                "1998-09-31",               // invalid day, sep max 30
//                "1998-11-31",               // invalid day, nov max 30
//                "2008-02-2x",               // invalid day 2x
//                "2008-0x-28",               // invalid month 0x
//                "20xx-02-28",               // invalid year 20xx
//                "20-11-02",                 // invalid year 20, must be yyyy
//                "2020/11/02",               // invalid date format, yyyy-mm-dd
//                "2020-11-32",               // invalid day, 32
//                "2020-13-30",               // invalid month 13
//                "2020-A-20",                // invalid month A
//                "2020-2-30",                // leap year, feb max 29
//                "2019-2-29",                // common year, feb max 28
//                "1900-02-29",               // 1900 is a common year, feb max 28
//                "12012-04-05",              // support only 4 digits years
//                " ",                        // empty
//                "");                        // empty
//    }

}

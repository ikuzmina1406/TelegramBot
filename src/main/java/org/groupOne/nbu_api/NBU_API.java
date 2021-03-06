package org.groupOne.nbu_api;

import org.groupOne.BankResponse;

import java.io.IOException;
import java.util.List;

public class NBU_API {

    private static final String URL_NAME = "https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json";

    public static List<BankResponse> getInfo() throws IOException, InterruptedException {
        return NbuUtill.getNbuCourses(URL_NAME);
    }

}

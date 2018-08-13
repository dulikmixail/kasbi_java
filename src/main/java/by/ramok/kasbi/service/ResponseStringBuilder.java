package by.ramok.kasbi.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

class ResponseStringBuilder {
    static StringBuilder getStringBuilder(HttpURLConnection con) {
        StringBuilder content = null;
        try (BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream(), "windows-1251"))) {

            String line;
            content = new StringBuilder();

            while ((line = in.readLine()) != null) {
                content.append(line);
                content.append(System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (con != null) {
                con.disconnect();
            }
        }
        return content;
    }
}

package by.ramok.kasbi;

public class Main {
//    public static void main(String[] args) {
//        System.setProperty("http.proxyHost", "127.0.0.1");
//        System.setProperty("https.proxyHost", "127.0.0.1");
//        System.setProperty("http.proxyPort", "8888");
//        System.setProperty("https.proxyPort", "8888");
//
//        System.out.println(getHashUrl());
//
//    }
//
//    private static HttpURLConnection con;
//    private static String url = "http://192.168.11.11:1992/Kasbi/";
//    private static String globalHashUrl = "";
//
//    public static String getHashUrl() {
//        if (!isValidHashUrl(globalHashUrl)) {
//            String hashUrl = getNewHashUrl();
//            Map<String, String> Params = getLoginParams(hashUrl);
//            login(Params, hashUrl);
//            globalHashUrl = hashUrl;
//        }
//        return globalHashUrl;
//    }
//
//    public static boolean isValidHashUrl(String hashUrl) {
//        String getUrl = url + hashUrl + "/Reports/default.aspx";
//        int responseCode = 0;
//        try {
//            URL myurl = new URL(getUrl);
//            con = (HttpURLConnection) myurl.openConnection();
//            con.setRequestMethod("GET");
//            con.setInstanceFollowRedirects(false);
//            responseCode = con.getResponseCode();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (con != null) {
//                con.disconnect();
//            }
//        }
//
//        return responseCode == 200;
//    }
//
//    public static String getNewHashUrl() {
//        String getUrl = url;
//        String hashUrl = "";
//        try {
//            URL myurl = new URL(getUrl);
//            con = (HttpURLConnection) myurl.openConnection();
//            con.setRequestMethod("GET");
//            con.setInstanceFollowRedirects(false);
//            Map<String, List<String>> headerFields = con.getHeaderFields();
////            System.out.println(headerFields.get("Location").get(0));
//            Matcher matcher = Pattern.compile("(\\(S\\(.+\\)\\))").matcher(headerFields.get("Location").get(0));
//            hashUrl = matcher.find() ? matcher.group() : "Not valid url";
////            System.out.println(hashUrl);
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (con != null) {
//                con.disconnect();
//            }
//        }
//        return hashUrl;
//    }
//
//    public static Map<String, String> getLoginParams(String hashUrl) {
//        String getUrl = url + hashUrl + "/Login.aspx";
//        Map<String, String> Params = new HashMap<>();
//        try {
//            URL myurl = new URL(getUrl);
//            con = (HttpURLConnection) myurl.openConnection();
//            con.setRequestMethod("GET");
//            con.setInstanceFollowRedirects(true);
//
//            StringBuilder content;
//
//            content = getStringBuilder();
//
////            System.out.println(content.toString());
//
//            Matcher matcher2 = Pattern.compile("(id=\"__VIEWSTATE\".*value=\")(.*)(\".*\\/>)").matcher(content.toString());
//            String viewstate = matcher2.find() ? matcher2.group(2) : "Not valid url";
//
//            Matcher matcher3 = Pattern.compile("(id=\"__VIEWSTATEGENERATOR\".*value=\")(.*)(\".*\\/>)").matcher(content.toString());
//            String viewstategenerator = matcher3.find() ? matcher3.group(2) : "Not valid url";
//
////            System.out.println(viewstate);
////            System.out.println(viewstategenerator);
//
//            Params.put("__VIEWSTATE", URLEncoder.encode(viewstate, "windows-1251"));
//            Params.put("__VIEWSTATEGENERATOR", URLEncoder.encode(viewstategenerator, "windows-1251"));
//            Params.put("txtLoginUser", "dulik");
//            Params.put("txtLoginPassword", "301292");
//            Params.put("btnLogin.x", "42");
//            Params.put("btnLogin.y", "1");
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (con != null) {
//                con.disconnect();
//            }
//        }
//        return Params;
//    }
//
//    private static StringBuilder getStringBuilder() throws IOException {
//        StringBuilder content;
//        try (BufferedReader in = new BufferedReader(
//                new InputStreamReader(con.getInputStream(), "windows-1251"))) {
//
//            String line;
//            content = new StringBuilder();
//
//            while ((line = in.readLine()) != null) {
//                content.append(line);
//                content.append(System.lineSeparator());
//            }
//        }
//        return content;
//    }
//
//    public static boolean login(Map<String, String> params, String hashUrl) {
//        String postUrl = url + hashUrl + "/Login.aspx";
//        StringBuilder urlParameters = new StringBuilder();
//        urlParameters
//                .append("__VIEWSTATE").append("=").append(params.get("__VIEWSTATE")).append("&")
//                .append("__VIEWSTATEGENERATOR").append("=").append(params.get("__VIEWSTATEGENERATOR")).append("&")
//                .append("txtLoginUser").append("=").append(params.get("txtLoginUser")).append("&")
//                .append("txtLoginPassword").append("=").append(params.get("txtLoginPassword")).append("&")
//                .append("btnLogin.x").append("=").append(params.get("btnLogin.x")).append("&")
//                .append("btnLogin.y").append("=").append(params.get("btnLogin.y"));
//
//        byte[] postData = urlParameters.toString().getBytes(StandardCharsets.UTF_8);
//
//        try {
//            URL myurl = new URL(postUrl);
//            con = (HttpURLConnection) myurl.openConnection();
//
//            con.setDoOutput(true);
//            con.setInstanceFollowRedirects(true);
//            con.setRequestMethod("POST");
//            con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
//
//            try (DataOutputStream wr = new DataOutputStream(con.getOutputStream())) {
//                wr.write(postData);
//            }
//
//            getStringBuilder();
////
////            System.out.println(content.toString());
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//
//            con.disconnect();
//        }
//        return true;
//    }

}

package test;

import org.json.JSONObject;
import org.testng.annotations.Test;

public class C3_Json_DataOlusturma {

    //Asagidaki JSON Objesini olusturup konsolda yazdirin.
    //{
    //    "title":"Ahmet",
    //    "body":"Merhaba",
    //    "userId":1
    //}

    @Test
    public void JsonData(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("title", "Ahmet");
        jsonObject.put("body", "Merhaba");
        jsonObject.put("userId", 1);

        System.out.println("Ilk Olusturdugum jsonData= " + jsonObject);

    }

    @Test
    public void innerJson(){
        /*
Asagidaki JSON Objesini olusturup konsolda yazdirin.

{
"firstname":"Jim",
 "additionalneeds":"Breakfast",
 "bookingdates":{
                "checkin":"2018-01-01",
                "checkout":"2019-01-01"
                },
"totalprice":111,
"depositpaid":true,
 "lastname":"Brown"
}
 */

        JSONObject innerJSONObj = new JSONObject();
        innerJSONObj.put("checkin","2018-01-01");
        innerJSONObj.put("checkout","2019-01-01");


        JSONObject jsonData = new JSONObject();
        jsonData.put("firstname","Jim");
        jsonData.put("additionalneeds","Breakfast");
        jsonData.put("bookingdates",innerJSONObj);
        jsonData.put("totalprice",111);
        jsonData.put("depositpaid",true);
        jsonData.put("lastname","Brown");

        System.out.println("JSONData" +jsonData);


    }



}

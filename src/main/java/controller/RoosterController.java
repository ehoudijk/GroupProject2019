package controller;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.Gson;
import model.PrIS;
import model.klas.Klas;
import model.persoon.Rooster;
import server.Conversation;
import server.Handler;

import javax.json.JsonObject;
import java.util.ArrayList;
import java.util.List;


public class RoosterController implements Handler {

    public RoosterController(PrIS infoSys) {
    }

    @Override
    public void handle(Conversation conversation) {
        //TODO: get studentid uit de conversation
        JsonObject jo = (JsonObject) conversation.getRequestBodyAsJSON();
        int id = jo.getInt("studentID");

        // roosters filteren op studentid
        List<Rooster> myRoosters = Rooster.getRoosters();
        List<Rooster> goodRoosters = new ArrayList<>();
        for (Rooster myRooster : myRoosters) {
            System.out.println("checking klas...");
            if(myRooster.getKlas() != null) System.out.println("rooster with klas found!");
            if (myRooster.getKlas() != null) {
                for (Klas kla : myRooster.getKlas()) {
                    if(kla.isStudentInKlas(id)) {
                        goodRoosters.add(myRooster);
                    }
                }
            }
        }


        // gefilterde roosters naar json
        String json = roosterToJson(goodRoosters);
        conversation.sendJSONMessage(json);
    }

    public String roosterToJson(List<Rooster> pRooster) {
        pRooster.remove(5);
        return new Gson().toJson(pRooster);
    }

}

package simulation.parsers;

import simulation.usine.Usine;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class UsineXmlLoader {

    private final ArrayList<Usine> usineList = new ArrayList<>();

    public void UsineXmlLoader(){
        usineList.addAll(readUsineInfo());
    }

    public List<Usine> readUsineInfo(){

        ArrayList<Usine> usineList = new ArrayList<>();

//        XMLParser xmlParser = new XMLParser();

        return usineList;
    }

    public ArrayList<Usine> getUsineList(){
        return usineList;
    }
}

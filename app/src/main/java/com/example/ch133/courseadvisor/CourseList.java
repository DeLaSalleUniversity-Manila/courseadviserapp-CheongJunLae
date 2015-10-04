package com.example.ch133.courseadvisor;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ch133 on 2015-10-04.
 */
public class CourseList {
    List<String> getCourses(String selectedterm){


                 List<String> courselist = new ArrayList<String>();


                 if(selectedterm.equals("1st Term")){
                         courselist.add("NSTP101");
                         courselist.add("LASARE1");
                         courselist.add("FITWELL");
                         courselist.add("KASPIL1");
                         courselist.add("MANAORG");
                         courselist.add("ENGLCOM");
                         courselist.add("FILKOMU");
                         courselist.add("COMALGE");
                     }
                 else if(selectedterm.equals("2nd Term")){
                         courselist.add("ACTBAS1");
                         courselist.add("BUSANA1");
                         courselist.add("ECONONE");
                         courselist.add("SCIMATC");
                         courselist.add("LBYMATC");
                         courselist.add("ENGLRES");
                         courselist.add("FILDLAR");
                         courselist.add("PERSEF1");
                         courselist.add("SAS1000");
                     }
                 else if(selectedterm.equals("3rd Term")){
                         courselist.add("ACTBAS2");
                         courselist.add("BUSANA2");
                         courselist.add("LBYACC1");
                         courselist.add("OBLICON");
                         courselist.add("NTROPSY");
                         courselist.add("KASPIL2");
                         courselist.add("SCIMATB");
                         courselist.add("LBYMATB");
                         courselist.add("FTSPORT");
                         courselist.add("NSTPW2");
                     }
                 else if(selectedterm.equals("4th Term")){
                         courselist.add("ACTBAS3");
                         courselist.add("PARTCOR");
                         courselist.add("MARKET1");
                         courselist.add("TREDTWO");
                         courselist.add("HUMAART");
                         courselist.add("STATACC");
                         courselist.add("FTDANCE");
                         courselist.add("INTFILO");
                         courselist.add("PERSEF2");
                         courselist.add("LASARE2");
                     }
                 else if(selectedterm.equals("5th Term")){
                         courselist.add("");
                         courselist.add("MODFIN1");
                         courselist.add("MODFIN2");
                         courselist.add("MODFIN3");
                         courselist.add("MODFIN4");
                         courselist.add("MODCOS1");
                         courselist.add("MODCOS2");
                         courselist.add("ACFINA1");
                         courselist.add("MANSCIE");
                     }
                 else if(selectedterm.equals("6th Term")){
                         courselist.add("ACCTAXI");
                         courselist.add("OPEMANA");
                         courselist.add("NEGOTIN");
                         courselist.add("ACETHIC");
                         courselist.add("ACFINA2");
                         courselist.add("TREDTRI");
                         courselist.add("SPEECOM");
                         courselist.add("ACCTREM");
                         courselist.add("PRACCAT");
                     }
                 return courselist;
         }
    }



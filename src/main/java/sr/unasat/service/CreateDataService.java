package sr.unasat.service;

import sr.unasat.entity.*;

import java.sql.Date;
import java.time.LocalDate;

public class CreateDataService {
    static AfdelingService afdelingService = new AfdelingService();
    static FunctieService functieService = new FunctieService();
    static WerknemerDetailService werknemerDetailService = new WerknemerDetailService();
    static  WerkUrenService werkUrenService = new WerkUrenService();
    static WerknemerService werknemerService = new WerknemerService();
    static InlogService inlogService = new InlogService();
    public static void CreateData(){





        Afdeling afdeling1 = new Afdeling();
        afdeling1.setAfdelingNaam("Frontdesk");
        Afdeling fd = afdelingService.addAfdeling(afdeling1);

        Afdeling afdeling2 = new Afdeling();
        afdeling2.setAfdelingNaam("Finance");
        Afdeling fin = afdelingService.addAfdeling(afdeling2);

        Afdeling afdeling3 = new Afdeling();
        afdeling3.setAfdelingNaam("Marketing");
        Afdeling mark = afdelingService.addAfdeling(afdeling3);

        Afdeling afdeling4 = new Afdeling();
        afdeling4.setAfdelingNaam("Hrm");
        Afdeling hrm = afdelingService.addAfdeling(afdeling4);

        Afdeling afdeling5 = new Afdeling();
        afdeling5.setAfdelingNaam("Magazijn");
        Afdeling mag = afdelingService.addAfdeling(afdeling5);

        Afdeling afdeling6 = new Afdeling();
        afdeling6.setAfdelingNaam("Sales");
        Afdeling sale = afdelingService.addAfdeling(afdeling6);
//--------------------------------------------------------------------

        Functie functie1 = new Functie();
        functie1.setFunctie("Directeur");
        functie1.setAfdeling(fin);
        Functie dirfin = functieService.addFunctie(functie1);

        Functie functie2 = new Functie();
        functie2.setFunctie("Onder-Directeur");
        functie2.setAfdeling(fin);
        Functie odfin = functieService.addFunctie(functie2);

        Functie functie3 = new Functie();
        functie3.setFunctie("Assistent");
        functie3.setAfdeling(fin);
        Functie assfin = functieService.addFunctie(functie3);

        Functie functie4 = new Functie();
        functie4.setFunctie("Assistent");
        functie4.setAfdeling(mark);
        Functie assmark = functieService.addFunctie(functie4);

//--------------------------------------------------------------------------------

        Werknemer werknemer1 = new Werknemer();
        werknemer1.setVoornaam("Dhiradj");
        werknemer1.setAchternaam("Bechan");
        werknemer1.setEmail("dbechan@hotmail.com ");
        Werknemer w1 = werknemerService.addWerknemer(werknemer1);

        Werknemer werknemer2 = new Werknemer();
        werknemer2.setVoornaam("jason");
        werknemer2.setAchternaam("Momoa");
        werknemer2.setEmail("jmomoa@hotmail.com ");
        Werknemer w2 = werknemerService.addWerknemer(werknemer2);

        Werknemer werknemer3 = new Werknemer();
        werknemer3.setVoornaam("Arijit");
        werknemer3.setAchternaam("Singh");
        werknemer3.setEmail("asingh@hotmail.com ");
        Werknemer w3 = werknemerService.addWerknemer(werknemer3);


        Werknemer werknemer4 = new Werknemer();
        werknemer4.setVoornaam("Peter");
        werknemer4.setAchternaam("Parker");
        werknemer4.setEmail("parker@hotmail.com ");
        Werknemer w4 = werknemerService.addWerknemer(werknemer4);



        werknemer1.setFuncties(assfin);
        werknemer1.setFuncties(assmark);
        werknemer2.setFuncties(assfin);
        assfin.setWerknemers(werknemer1);
        assfin.setWerknemers(werknemer2);
        assmark.setWerknemers(werknemer1);
//-----------------------------------------------------------------------------------------
        WerknemerDetail adres1 = new WerknemerDetail();
        adres1.setAdress("Ramdasstraat#14");
        adres1.setTelefoon(8874555);
        adres1.setGeboorteDatum(LocalDate.of(1999,5,24));
        adres1.setWerknemerId(w1);
        werknemerDetailService.addWerknemerDetail(adres1);

        WerknemerDetail adres2 = new WerknemerDetail();
        adres2.setAdress("Oranjestraat#5");
        adres2.setTelefoon(8958862);
        adres2.setGeboorteDatum(LocalDate.of(1984,12,5));
        adres2.setWerknemerId(w2);
        werknemerDetailService.addWerknemerDetail(adres2);

        WerknemerDetail adres3 = new WerknemerDetail();
        adres3.setAdress("Paarsstraat#74");
        adres3.setTelefoon(8612565);
        adres3.setGeboorteDatum(LocalDate.of(1975,8,15));
        adres3.setWerknemerId(w3);
        werknemerDetailService.addWerknemerDetail(adres3);

        WerknemerDetail adres4 = new WerknemerDetail();
        adres4.setAdress("Groenstraat#34");
        adres4.setTelefoon(8651652);
        adres4.setGeboorteDatum(LocalDate.of(1981,9,12));
        adres4.setWerknemerId(w4);
        werknemerDetailService.addWerknemerDetail(adres4);

//---------------------------------------------------------------------------------

        WerkUren werkUren1 = new WerkUren();
        werkUren1.setMaand("Januari");
        werkUren1.setAantalUren(21.5);
        werkUren1.setUurloon(150);
        werkUren1.setWerknemerId(w1);
        werkUrenService.addWerkUren(werkUren1);

        WerkUren werkUren2 = new WerkUren();
        werkUren2.setMaand("Februari");
        werkUren2.setAantalUren(55);
        werkUren2.setUurloon(150);
        werkUren2.setWerknemerId(w1);
        werkUrenService.addWerkUren(werkUren2);

        InlogWerknemer inlog1 = new InlogWerknemer();
        inlog1.setUsername("dbechan");
        inlog1.setPassword("Bechan1234");
        //inlog1.setWerknemerId(w1);
        inlogService.addInlogGegevens(inlog1);

    }
    public static void getInfo(){
        System.out.println(werknemerService.getWerknemers());
    }


}

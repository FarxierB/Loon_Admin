package sr.unasat.service;

import sr.unasat.entity.*;

import java.util.List;
import java.util.Set;

public class CreateDataService {

    public static void CreateData(){

    AfdelingService afdelingService = new AfdelingService();
    FunctieService functieService = new FunctieService();
    WerknemerDetailService werknemerDetailService = new WerknemerDetailService();
    WerkUrenService werkUrenService = new WerkUrenService();
    WerknemerService werknemerService = new WerknemerService();

  /*  Werknemer person1 = new Werknemer();
        person1.setVoornaam("Shaq");
        person1.setAchternaam("O'Neil");
        person1.setEmail("soneil@hotmail.com ");
    Werknemer Adres1BijWerknemer1 = werknemerService.addWerknemer(person1);

    WerknemerDetail adres1 = new WerknemerDetail();
        adres1.setAdress("Elisabethshof #3");
        adres1.setTelefoon(8859895);
        adres1.setGeboorteDatum("12-12-1992");
        adres1.setWerknemerId(Adres1BijWerknemer1);
        werknemerDetailService.addWerknemerDetail(adres1);

    Werknemer person2 = new Werknemer();
        person2.setVoornaam("Dhiradj");
        person2.setAchternaam("Bechan");
        person2.setEmail("dbechan@hotmail.com ");

        werknemerService.addWerknemer(person2);
        */

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
//-----------------------------------------------------------------------------------------
        WerknemerDetail adres1 = new WerknemerDetail();
        adres1.setAdress("Ramdasstraat#14");
        adres1.setTelefoon(8874555);
        adres1.setGeboorteDatum("24-05-1999");
        adres1.setWerknemerId(w1);
        werknemerDetailService.addWerknemerDetail(adres1);

        WerknemerDetail adres2 = new WerknemerDetail();
        adres2.setAdress("Oranjestraat#5");
        adres2.setTelefoon(8958862);
        adres2.setGeboorteDatum("05-12-1984");
        adres2.setWerknemerId(w2);
        werknemerDetailService.addWerknemerDetail(adres2);

        WerknemerDetail adres3 = new WerknemerDetail();
        adres3.setAdress("Paarsstraat#74");
        adres3.setTelefoon(8612565);
        adres3.setGeboorteDatum("15-08-1975");
        adres3.setWerknemerId(w3);
        werknemerDetailService.addWerknemerDetail(adres3);

        WerknemerDetail adres4 = new WerknemerDetail();
        adres4.setAdress("Groenstraat#34");
        adres4.setTelefoon(8651652);
        adres4.setGeboorteDatum("12-09-1981");
        adres4.setWerknemerId(w4);
        werknemerDetailService.addWerknemerDetail(adres4);

//---------------------------------------------------------------------------------

        WerkUren werkUren1 = new WerkUren();
        werkUren1.setMaand("Januari");
        werkUren1.setAantalUren(21.5);
        werkUren1.setUurloon(150);
        werkUren1.setWerknemerId(w1);
        werkUrenService.addWerkUren(werkUren1);



    }

}

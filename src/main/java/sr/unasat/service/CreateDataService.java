package sr.unasat.service;

import sr.unasat.entity.Afdeling;
import sr.unasat.entity.Functie;
import sr.unasat.entity.Werknemer;
import sr.unasat.entity.WerknemerDetail;

public class CreateDataService {

    public static void CreateData(){

    AfdelingService afdelingService = new AfdelingService();
    FunctieService functieService = new FunctieService();
    WerknemerDetailService werknemerDetailService = new WerknemerDetailService();
    WerkUrenService werknemerSalarisService = new WerkUrenService();
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
        afdeling1.setAfdelingNaam("Administratie");
        Afdeling admin = afdelingService.addAfdeling(afdeling1);

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
        functie1.setFunctie("Manager");
        functie1.setAfdeling(fin);
        Functie manfin = functieService.addFunctie(functie1);

        Functie functie2 = new Functie();
        functie2.setFunctie("Assistent");
        functie2.setAfdeling(fin);
        Functie assfin = functieService.addFunctie(functie2);






    }

}

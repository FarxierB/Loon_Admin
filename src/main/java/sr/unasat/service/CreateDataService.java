package sr.unasat.service;

import sr.unasat.entity.Werknemer;
import sr.unasat.entity.WerknemerDetail;

public class CreateDataService {

    public static void CreateData(){

    AfdelingService afdelingService = new AfdelingService();
    FunctieService functieService = new FunctieService();
    WerknemerDetailService werknemerDetailService = new WerknemerDetailService();
    WerknemerSalarisService werknemerSalarisService = new WerknemerSalarisService();
    WerknemerService werknemerService = new WerknemerService();

    Werknemer person1 = new Werknemer();
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

    }

}

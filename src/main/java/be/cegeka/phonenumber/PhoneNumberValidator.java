package be.cegeka.phonenumber;

    /*
    * Een telefoon nummer is altijd opgebouwd uit een landcode, een netcode en een abonneenummer.
    * De landcode begint steeds met een +m, gevolgd door een optionele spatie, gevolgd door 2 cijfers. De landcode mag ook vervangen worden door een 0.
    * Tussen de landcode en de netcode mag er een spatie staan.
    * Een netcode is een getal dat bestaat uit 1 of 2 cijfers. In het geval van een gsm-nummer staat er een 4 voor de netcode.
    * Tussen de netcode en het abonneenummer is er een spatie
    * Het abonneenummer wordt steeds gegroepeerd per twee cijfers. Bij een oneven aantal cijfers bestaat het eerste groepje uit 3 cijfers.
    * Het abonneenummer kan 6 of 7 cijfers lang zijn.
    *
    * Alle spaties mogen ook vervangen worden door een koppelteken als scheidingsteken. Een mix van spaties en koppeltekens is niet toegestaan.
    * */

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class PhoneNumberValidator {

    private String phoneNumber;

    public PhoneNumberValidator(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isValid() {
        throw new NotImplementedException();
    }
}

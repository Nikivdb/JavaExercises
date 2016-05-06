package be.cegeka.phonenumber;

import org.junit.Assert;
import org.junit.Test;

public class PhoneNumberValidatorTest {

    @Test
    public void isValid_OnEmptyString_returnsFalse() {
        Assert.assertFalse(new PhoneNumberValidator("").isValid());
    }

    @Test
    public void isValid_withTwoDigitNetCodeAndNoLandCode_returnsTrue() {
        Assert.assertTrue(new PhoneNumberValidator("011 32 43 54").isValid());
    }

    @Test
    public void isValid_withOneDigitNetCodeAndNoLandCode_returnsTrue() {
        Assert.assertTrue(new PhoneNumberValidator("02 345 67 89").isValid());
    }

    @Test
    public void isValid_withCellPhoneNumberAndNoLandCode_returnsTrue() {
        Assert.assertTrue(new PhoneNumberValidator("0486 98 76 54").isValid());
    }

    @Test
    public void isValid_withTwoDigitNetCodeAndLandCode_returnsTrue() {
        Assert.assertTrue(new PhoneNumberValidator("+32 11 32 43 54").isValid());
    }

    @Test
    public void isValid_withOneDigitNetCodeAndLandCode_returnsTrue() {
        Assert.assertTrue(new PhoneNumberValidator("+32 2 345 67 89").isValid());
    }

    @Test
    public void isValid_withCellPhoneNumberAndLandCode_returnsTrue() {
        Assert.assertTrue(new PhoneNumberValidator("+32 486 98 76 54").isValid());
    }

    @Test
    public void isValid_withTwoDigitNetCodeAndNoLandCodeWithDashAsSeparator_returnsTrue() {
        Assert.assertTrue(new PhoneNumberValidator("011-32-43-54").isValid());
    }

    @Test
    public void isValid_withOneDigitNetCodeAndNoLandCodeWithDashAsSeparator_returnsTrue() {
        Assert.assertTrue(new PhoneNumberValidator("02-345-67-89").isValid());
    }

    @Test
    public void isValid_withCellPhoneNumberAndNoLandCodeWithDashAsSeparator_returnsTrue() {
        Assert.assertTrue(new PhoneNumberValidator("0486-98-76-54").isValid());
    }

    @Test
    public void isValid_withTwoDigitNetCodeAndLandCodeWithDashAsSeparator_returnsTrue() {
        Assert.assertTrue(new PhoneNumberValidator("+32-11-32-43-54").isValid());
    }

    @Test
    public void isValid_withOneDigitNetCodeAndLandCodeWithDashAsSeparator_returnsTrue() {
        Assert.assertTrue(new PhoneNumberValidator("+32-2-345-67-89").isValid());
    }

    @Test
    public void isValid_withCellPhoneNumberAndLandCodeWithDashAsSeparator_returnsTrue() {
        Assert.assertTrue(new PhoneNumberValidator("+32-486-98-76-54").isValid());
    }

    @Test
    public void isValid_withMixedSpacesAndDashes_returnsFalse() {
        Assert.assertFalse(new PhoneNumberValidator("+32-486 98-76 54").isValid());
    }

    @Test
    public void isValid_withInvalidLandCode_returnsFalse() {
        Assert.assertFalse(new PhoneNumberValidator("32-486-98-76-54").isValid());
    }

    @Test
    public void isValid_withToLongAbonneeNumber_returnsFalse() {
        Assert.assertFalse(new PhoneNumberValidator("+32 486 98 76 54 45").isValid());
    }

    @Test
    public void isValid_withBadOrderingOfOddAbonneeNumber_returnsFalse() {
        Assert.assertFalse(new PhoneNumberValidator("+32-2-34-567-89").isValid());
    }

    @Test
    public void isValid_withInvalidMobilPhoneNumberOtherNumberThenFourIsUsed_returnsFalse() {
        Assert.assertFalse(new PhoneNumberValidator("+32 786 98 76 54").isValid());
    }

    @Test
    public void isValid_withNoLandCode_returnsFalse() {
        Assert.assertFalse(new PhoneNumberValidator("486 98 76 54").isValid());
    }

}


//
//
//0486 98 76 54 (gsm)
//
//+ 32 11 32 43 54
//+ 32 2 345 67 89
//+ 32 486 98 76 54 (gsm)
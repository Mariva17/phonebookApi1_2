package api.tests;

import api.helpers.PhoneHelper;
import api.phone.PhoneApi;
import org.testng.annotations.Test;

public class CommonPhoneTests {

    PhoneApi phoneApi = new PhoneApi();
    Integer contactId = 4911;

    PhoneHelper phoneHelper = new PhoneHelper();

    @Test
    public void createEditDeleteNewPhone() {
        Integer phoneId = phoneHelper.createPhone(contactId);

        phoneHelper.editPhone(phoneId, contactId);

        phoneHelper.deletePhone(phoneId);


    }

}

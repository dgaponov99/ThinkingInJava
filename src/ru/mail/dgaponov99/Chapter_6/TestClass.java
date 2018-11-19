package ru.mail.dgaponov99.Chapter_6;

import ru.mail.dgaponov99.Chapter_6.SomePackage.WhatAboutProtected;

public class TestClass {

    public static void main(String[] args) {
        //! WhatAboutProtected.protectedHello();
        WhatAboutProtected.publicHello();
        //! WhatAboutProtected.hello();
        //! WhatAboutProtected.privateHello();
    }
}

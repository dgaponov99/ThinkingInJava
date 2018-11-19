package ru.mail.dgaponov99.Chapter_6.SomePackage.AnothePackage;

import ru.mail.dgaponov99.Chapter_6.SomePackage.WhatAboutProtected;

public class NewTestClass {

    public static void main(String[] args) {
        WhatAboutProtected.publicHello();
        //! WhatAboutProtected.protectedHello();
        //! WhatAboutProtected.hello();
        //! WhatAboutProtected.privateHello();
    }
}

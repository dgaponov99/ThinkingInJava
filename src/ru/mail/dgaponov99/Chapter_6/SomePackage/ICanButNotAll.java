package ru.mail.dgaponov99.Chapter_6.SomePackage;

public class ICanButNotAll {

    public static void main(String[] args) {
        WhatAboutProtected.publicHello();
        WhatAboutProtected.protectedHello();
        WhatAboutProtected.hello();
        //! WhatAboutProtected.privateHello();
    }
}

package ru.mail.dgaponov99.Chapter_2;

class StorageMethod {
    int storage(String s) {
        return s.length() * 2;
    }
}

class TestStorageMethod {

    public static void main(String[] args) {
        StorageMethod storageMethod = new StorageMethod();
        int length  = storageMethod.storage("hello, world");
        System.out.println(length);
    }
}

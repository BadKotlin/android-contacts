package ru.yandex.practicum.contacts.model;

public enum ContactType {
    TELEGRAM,
    WHATS_APP,
    VIBER,
    SIGNAL,
    THREEMA,
    PHONE,
    EMAIL;

    public static ContactType[] getContactTypes() {
        ContactType[] contacts = {TELEGRAM, WHATS_APP, VIBER, SIGNAL, THREEMA, PHONE, EMAIL};
        return contacts;
    }
}

package com.example.phonebook_final.data

import com.example.phonebook_final.data.model.Contact

class Datasource {
    var contactList = mutableListOf<Contact>(
        Contact("Fetullah Andug", "017661818706"),
        Contact("Andrea Willenschmidt", "015764635245"),
        Contact("Karlos Antonius", "02217563824"),
        Contact("Pablo Escobar", "01717463434"),
        Contact("Jonny Depp", "015754637294"),
        Contact("Julius Caesar", "+492217563827"),
        Contact("Dora Frankenstein", "+9055346284721"),
        Contact("Friedrich Merle", "+017468246842"),
    )

    fun getContacts() : MutableList<Contact>{
        return contactList
    }
}
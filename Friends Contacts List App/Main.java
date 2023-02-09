public class Main {
    public static void main(String[] args) {
        ContactsManager myContactsManager = new ContactsManager();
        Contact myContact1 = new Contact("Bilal","bilal@gmail.com","08039365956");
        Contact myContact2 = new Contact("Mubarak","mubarak@gmail.com","08039365956");


        myContactsManager.addContact(myContact1);
        myContactsManager.addContact(myContact2);
        Contact result = myContactsManager.searchContact("Mubarak");
        System.out.println(result.name);
    }
}

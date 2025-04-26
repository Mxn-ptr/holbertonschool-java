import java.util.ArrayList;

public class Mobile {
	private ArrayList<Contact> contacts;

	public Mobile() {
		this.contacts = new ArrayList<>();
	}

	public int getContactPosition(String name) {
		for (int i = 0; i < this.contacts.size(); i++) {
			if (contacts.get(i).getName().equals(name))
				return i;
		}
		return -1;
	}

	public void addContact(Contact contact) {
		if (this.getContactPosition(contact.getName()) >= 0)
			throw new IllegalArgumentException("Could not add contact. Contact with this name already exists");
		this.contacts.add(contact);
	}

	public void updateContact(Contact oldContact, Contact newContact) {
		int position = this.getContactPosition(oldContact.getName());
		if (position == -1)
			throw new IllegalArgumentException("Could not add contact. Contact does not exist");
		int newContactPosition = this.getContactPosition(newContact.getName());
		if (newContactPosition >= 0 && newContactPosition != position)
		throw new IllegalArgumentException("Could not modify contact. Contact with this name already exists");
		this.contacts.set(position, newContact);
	}

	public void removeContact(Contact contact) {
		int position = this.getContactPosition(contact.getName());
		if (position == -1)
			throw new IllegalArgumentException("Could not remove contact. Contact does not exist");
		this.contacts.remove(position);
	}

	public void listContacts() {
		String response = new String();
		for (Contact contact: this.contacts) {
			response += String.format("%s -> %s (%s)\n", contact.getName(), contact.getPhoneNumber(), contact.getNumberType());
		}
		System.out.print(response);
	}
}

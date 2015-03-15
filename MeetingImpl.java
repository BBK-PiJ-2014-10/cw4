import java.util.Calendar;
import java.util.Set;

public class MeetingImpl implements Meeting {
    public static int count;
    private int id;
    private Calendar date;
    private Set<Contact> contacts;

    public MeetingImpl(Set<Contact> contactsToSet, Calendar dateToSet) {
        this.count ++;
        this.id = this.count;
        this.contacts = contactsToSet;
        this.date = dateToSet;
    }
    /**
     * Returns the id of the meeting.
     *
     * @return the id of the meeting.
     */
    @Override
    public int getId() {
        return this.id;
    }

    /**
     * Return the date of the meeting.
     *
     * @return the date of the meeting.
     */
    @Override
    public Calendar getDate() {
        return this.date;
    }

    /**
     * Return the details of people that attended the meeting.
     *
     * The list contains a minimum of one contact (if there were
     * just two people: the user and the contact) and may contain an
     * arbitrary number of them. *
     *
     * @return the details of people that attended the meeting.
     */
    @Override
    public Set<Contact> getContacts() {
        return this.contacts;
    }
}

package ContactList;


public class Contact {
    
    private String firstName;
    private String lastName;
    private String email;
    private String getPhone;

    
    public String getFirstName() {
        return firstName;
    }

    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the getPhone
     */
    public String getGetPhone() {
        return getPhone;
    }

    /**
     * @param getPhone the getPhone to set
     */
    public void setGetPhone(String getPhone) {
        this.getPhone = getPhone;
    }
    
    public String displayContact(){
        
        String contact = "-----------------\n";
                contact +=  "Current Contact ------\n";
                contact += "-----------------\n";
                contact += "Name: " + firstName + lastName;
                contact += "Email Address: " + email;
                contact += "Phone Number:  " + getPhone;
                contact += "-------------------------------";
        
        return contact;
    }
    
    /*
    
    public String displayContact(){
    StringBuilder sb = new StringBuilder(); // for any appending operation use StringBuilder. 
    sb.append("----Current Contact ----\n");
    sb.append("Name:    ");
    return sb.toString();
    }
    
    */
    
}

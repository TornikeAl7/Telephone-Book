public class PhoneBook {
    private Entry[] entries;

    public PhoneBook(Entry[] entries){
        if(entries==null && entries.length ==0 && !isSorted(entries)){
            throw new IllegalArgumentException("The provided array must be non-empty and sorted.");
        }
        this.entries=entries;
    }

    private boolean isSorted(Entry[] entries){
        for(int i=1; i<entries.length; i++){
            if(entries[i-1].getFirstName().compareTo(entries[i].getFirstName()) >0){
                return false;
            }
        }
        return true;
    }


    public String find(String firstName, String lastName){
        int low = 0;
        int high = entries.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int comparisonResult = entries[mid].getFirstName().compareTo(firstName);

            if (comparisonResult == 0) {
                if (entries[mid].getLastName().equals(lastName)) {
                    return entries[mid].getPhoneNumber();
                } else if (entries[mid].getLastName().compareTo(lastName) < 0) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            } else if (comparisonResult < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }
}

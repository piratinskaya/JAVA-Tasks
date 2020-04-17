public class Caller {

    private String name;
    private String city;
    private String phone;

    public Caller() {
        name = "";
        phone = "";
        city = "";
    }

    public Caller(String name, String phone, String city) {
        if (phone.matches("^(\\+7|8)+[0-9]{10}$")) {
            this.name = name;
            this.phone = phone;
            this.city = city;
        }
        else throw new IllegalArgumentException("Неправильный формат  телефона.");
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void clearPhone() {
        this.phone = "";
    }

    public void clearName() {
        this.name = "";
    }

    public void clearCity(String city) {
        this.city = "";
    }

    public void getInfo() {
        System.out.printf("Организация: %s\nТелефон: %s\nГород: %s\n\n", name, phone, city);
    }

}


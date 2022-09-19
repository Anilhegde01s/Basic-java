class personspro{
    static void work(String company, double salary){
        System.out.println("enter the company salary");
        if(company=="TCS" && salary==5.2){
            System.out.println("company: " +company);
            System.out.println("salary: " +salary);
            return;
        }
    }
    static void work(String company, double salary, string designation){
        System.out.println("entered company salary designation");
        if(company=="TCS" && salary==5.2 && designation=="team leader"){
            System.out.println("comapny: " +company);
            System.out.println("salry: " +salary);
            System.out.println("designation: " +designation);
            return;
        }
    }
}
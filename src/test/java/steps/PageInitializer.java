package steps;


public class PageInitializer {

    public static loginpage login;
    public static dashboardPage dashboard;
    public static addEmployeePage addEmployee;
    public static employeeListPage employeeList;


    public static void intializePageObjects(){
        login = new loginPage();
        dashboard = new dashboardPage();
        addEmployee = new addEmployeePage();
        employeeList = new employeeListPage();
    }
}

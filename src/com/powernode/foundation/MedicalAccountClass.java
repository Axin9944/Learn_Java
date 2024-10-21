package com.powernode.foundation;

public class MedicalAccountClass extends CreditAccountClass {

    static {
        System.out.println("MedicalAccountClass 的静态方法执行了");
    }
    //医疗存款
    double sal;

    public MedicalAccountClass() {
    }

    public MedicalAccountClass(String name, int acounId, double sal) {
        super(name, acounId);
        this.sal = sal;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public void medicalaccountclass(){
        System.out.println("MedicalAccountClass's medicalaccountclass method invoke!");
    }
}

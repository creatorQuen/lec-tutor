package lec26;

public class Main {
    public static void main(String[] args) {
        TaskFactory factory = new TaskFactory();
//        ITaskProgressCallBack callback = new ITaskProgressCallBack() {
//            @Override
//            public void updateTask(Task task) {
//                factory.updateTask(task);
//            }
//        };
        // OR
        //ITaskProgressCallBack callback = task -> factory.updateTask(task);
        // OR
        //ITaskProgressCallBack callback = factory::updateTask;

        // OR
        ITaskProgressCallBack callback = new CallbackImpl(factory);

//        EmployeeChain chain = new EmployeeChain(new Designer(callback, "Alycia"));
//        EmployeeChain next = new EmployeeChain(new Programmer(callback, "John"));
//        EmployeeChain last = new EmployeeChain(new Tester(callback, "Steve"));
//        next.setNextEmployee(last);
//        chain.setNextEmployee(next);

        EmployeeChain chain = new EmployeeChain(
                new EmployeeChain(
                      new Designer(callback, "Alycia"),
                      new Programmer(callback, "John")
                ),
                new Tester(callback, "Steve")
        );

//        while (true)
//            chain.doTask(factory.getTask());

        while (true) {
            if (!chain.doTask(factory.getTask()))
                break;
        }
    }
}

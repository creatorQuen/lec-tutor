package lec26;

public class EmployeeChain implements ITaskHandler {

//    private final Employee employee;
//    private EmployeeChain nextEmployeeChain;
//
//    public EmployeeChain(Employee employee) {
//        this.employee = employee;
//    }

    private final ITaskHandler first;
    private final ITaskHandler second;

    public EmployeeChain(ITaskHandler first, ITaskHandler second) {
        this.first = first;
        this.second = second;
    }


//    public boolean doTask(Task task) {
//        if (task.getStatus() == employee.getTaskStatus()) {
//            employee.doTask(task);
//            return true;
//        } else if (nextEmployeeChain != null) {
//            return nextEmployeeChain.doTask(task);
//        } else {
//            //throw new IllegalArgumentException("task can't be handled");
//            return false;
//        }
//    }

//    public boolean doTask(Task task) {
//        if (employee.canHandleTask(task)) {
//            employee.doTask(task);
//            return  true;
//        } else if (nextEmployeeChain != null) {
//            return nextEmployeeChain.doTask(task);
//        } else {
//            return false;
//        }
//    }


//    public boolean doTask(Task task) {
//        boolean result = false;
//
//        if (employee.canHandleTask(task)) {
//            employee.doTask(task);
//            result = true;
//        } else if (nextEmployeeChain != null) {
//            result = nextEmployeeChain.doTask(task);
//        }
//
//        return result;
//    }
//
//    public void setNextEmployee(EmployeeChain nextEmployeeChain) {
//        this.nextEmployeeChain = nextEmployeeChain;
//    }

    @Override
    public boolean doTask(Task task) {
        boolean result;
        result = first.doTask(task);
        if (!result) {
            result = second.doTask(task);
        }
        return result;
    }
}

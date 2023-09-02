package lec26;

public class Programmer extends Employee {
    protected Programmer(ITaskProgressCallBack callBack, String name) {
        super(callBack, name, Task.Status.READY_TO_DO);
    }

    @Override
    protected Task getTaskWhenDone(Task task) {
        return new Task(
                task.getId(),
                Task.Status.READY_FOR_TESTING,
                task.getDescription(),
                task.getDesignLink(),
                task.getTestcase(),
                getBuildLinkForTask(task.getId())
        );
    }

    protected String getDetails(Task task) {
        return " with task id " + task.getId() +
                " and designLink " + task.getDesignLink() +
                "\n and testcase " + task.getTestcase();
    }

    private String getBuildLinkForTask(int taskId) {
        return "https://bitbucket/project/link_forbuild_with_task_id_" + taskId;
    }
}

package validators;

import java.util.ArrayList;
import java.util.List;

import models.Task;

public class TaskValidator {

    public static List<String> validate(Task task) {
        List<String> errors = new ArrayList<String>();

        String taskName_error = _validateTaskName(task.getTaskName());

        if (!taskName_error.equals("")) {
            errors.add(taskName_error);
        }

        String content_error = _validateContent(task.getContent());

        if (!content_error.equals("")) {
            errors.add(content_error);
        }
        return errors;
    }

    private static String _validateTaskName(String taskName) {
        if (taskName == null || taskName.equals("")) {
            return "タスク名を入力してください。";
        }
        return "";
    }

    private static String _validateContent(String content) {
        if (content == null || content.equals("")) {
            return "タスク内容を入力してください。";
        }
        return "";
    }
}

package syc.learn;

import lombok.Data;

import java.util.List;

/**
 * @author syc
 * @date 2022/12/8
 */
@Data
public class StoryTrainVO {
    private List<Story> stories;

    @Data
    public static class Story {
        private String story;
        private List<Step> steps;
    }

    @Data
    public static class Step {
    }

    @Data
    public static class IntentStep extends Step {
        private String intent;
    }

    @Data
    public static class ActionStep extends Step {
        private String action;
    }

    @Data
    public static class OrStep extends Step {
        private List<Step> or;
    }



}

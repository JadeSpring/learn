package syc.learn;

import lombok.Data;

import java.util.List;

/**
 * @author syc
 * @date 2022/12/8
 */
@Data
public class StoryTrainVO1 {
    private List<Story> stories;

    @Data
    public static class Story {
        private String story;
        private List<Step> steps;
    }

    @Data
    public static class Step {
        private String intent;
        private String action;
        private List<Step> or;
    }


}

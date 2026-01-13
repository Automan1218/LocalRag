package sg.edu.nus.p2.entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TextChunk {
    private Integer chunkId;    // 文本分块序号
    private String textContent; // 文本内容

    public TextChunk(Integer chunkId, String textContent) {
        this.chunkId = chunkId;
        this.textContent = textContent;
    }
}

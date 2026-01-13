package sg.edu.nus.p2.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "chunk_info")
public class ChunkInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fileMd5;

    /** 分块的索引号
     * 表示文件中的第几个分块，用于保持分块的顺序
     */
    private int chunkIndex;

    /** 分块的MD5值
     * 每个分块的唯一标识，用于校验分块的完整性和正确性
     */
    private String chunkMd5;

    private String storagePath;
}

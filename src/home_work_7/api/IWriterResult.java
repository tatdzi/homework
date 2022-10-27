package home_work_7.api;

import home_work_7.dto.Word;

import java.io.File;

public interface IWriterResult {
    void write(File book, Word word);
}

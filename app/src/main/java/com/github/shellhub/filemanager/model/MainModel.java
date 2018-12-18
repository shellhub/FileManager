package com.github.shellhub.filemanager.model;

import com.github.shellhub.filemanager.entity.FileEntity;
import com.github.shellhub.filemanager.event.FileActionEvent;
import com.github.shellhub.filemanager.event.RenameEvent;
import com.github.shellhub.filemanager.presenter.impl.MainPresenterImpl;

import java.util.List;

public interface MainModel {

    interface Callback{
        void onLoadFiles(List<FileEntity> fileEntities);

        void onShouldBackHome();

        void onRenameCompleted(RenameEvent renameEvent);

        void onAudioLoad(String audioPath);
    }

    void loadFiles(String rootPath, Callback callback);

    void loadParent(Callback callback);

    void handleFileAction(FileActionEvent fileActionEvent, Callback callback);

}

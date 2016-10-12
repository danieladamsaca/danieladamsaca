package com.raywenderlich.reposearch;

import java.util.ArrayList;

/**
 * Created by danieladams on 10/11/16.
 */

public interface DownloadCompleteListener {
    void downloadComplete(ArrayList<Repository> repositories);

}

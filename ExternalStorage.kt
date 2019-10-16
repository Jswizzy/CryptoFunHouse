package com.arrowmaker.cryptofunhouse.files

import android.os.Environment

class ExternalStorage {

    /* Checks if external storage is available for read and write */
    fun isExternalStorageWritable(): Boolean =
        Environment.getExternalStorageState() == Environment.MEDIA_MOUNTED

    /* Checks if external storage is available to at least read */
    fun isExternalStorageReadable(): Boolean =
        Environment.getExternalStorageState() in
                setOf(Environment.MEDIA_MOUNTED, Environment.MEDIA_MOUNTED_READ_ONLY)
}
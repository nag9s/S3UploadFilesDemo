package com.myorg;

import software.amazon.awscdk.App;

public final class S3UploadFilesDemoApp {
    public static void main(final String[] args) {
        App app = new App();

        new S3UploadFilesDemoStack(app, "S3UploadFilesDemoStack");

        app.synth();
    }
}

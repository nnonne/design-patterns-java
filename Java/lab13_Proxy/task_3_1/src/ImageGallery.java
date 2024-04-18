public class ImageGallery {

    public static void main(String[] args) {
        String path = "D:/studying/master/2 сем/design-patterns-java/Java/lab13_Proxy/task_3_1/resources/";

        DisplayObject[] images = {
                new Proxy(path + "image1.jpeg"),
                new Proxy(path + "image2.jpeg"),
                new Proxy(path + "image3.jpeg"),
                new Proxy(path + "image4.jpeg"),
                new Proxy(path + "image5.jpeg"),
                new Proxy(path + "image6.jpeg"),
                new Proxy(path + "image7.jpeg"),
                new Proxy(path + "image8.jpeg"),
                new Proxy(path + "image9.jpeg"),
                new Proxy(path + "image10.jpeg"),
        };

        for (DisplayObject image : images) {
            image.display();
        }

    }
}
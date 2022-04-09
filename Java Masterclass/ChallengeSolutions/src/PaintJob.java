public class PaintJob {
    // If Bob knows all the information about his job.
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        } else {
            return (int) Math.ceil(((width * height) / areaPerBucket) - extraBuckets);
        }
    }
    // If Bob doesn't have extra buckets, or too lazy to get extra buckets.
    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            return (int) Math.ceil((width * height) / areaPerBucket);
        }
    }
    // If Bob doesn't know height or width, but does know area.
    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            return (int) Math.ceil(area / areaPerBucket);
        }
    }
}

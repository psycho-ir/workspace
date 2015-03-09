package reference;

/**
 * Created by soroosh on 1/14/15.
 */
class GarbageCollectorManager {

    private static boolean collectionWasForced;
    private static int refCounter = 0;

    public GarbageCollectorManager() {
        refCounter++;
    }

    @Override
    protected void finalize() {
        try {
            collectionWasForced = true;
            refCounter--;
            super.finalize();
        } catch (Throwable ex) {
            System.out.println(ex);
        }
    }

    public int forceGarbageCollection() {
        final int TEMPORARY_ARRAY_SIZE_FOR_GC = 200_000;
        int iterationsUntilCollected = 0;
        collectionWasForced = false;

        if (refCounter < 2)
            new GarbageCollectorManager();

        while (!collectionWasForced) {
            iterationsUntilCollected++;
            int[] arr = new int[TEMPORARY_ARRAY_SIZE_FOR_GC];
            arr = null;
        }

        return iterationsUntilCollected;
    }

}

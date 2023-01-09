package FloodFill;

public class FloodFill {

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int color = image[sr][sc];
        if (color != newColor) dfs(image, sr, sc, color, newColor);
        return image;
    }
    public void dfs(int[][] image, int sr, int sc, int color, int newColor) {
        if (image[sr][sc] == color) {
            image[sr][sc] = newColor;
            if(sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length) return;

            dfs(image, sr-1, sc, color, newColor);
            dfs(image, sr, sc-1, color, newColor);
            dfs(image, sr+1, sc, color, newColor);
            dfs(image, sr, sc+1, color, newColor);
        }
    }
}

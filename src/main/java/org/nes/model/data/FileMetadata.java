package org.nes.model.data;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class FileMetadata {

    @SerializedName("file_name")
    private String fileName;

    @SerializedName("file_size")
    private long fileSize;

    @SerializedName("piece_lenght") // keeping the typo as in JSON
    private int pieceLength;

    @SerializedName("pieces")
    private List<Piece> pieces;

    @SerializedName("created_at")
    private String createdAt;

    @SerializedName("download_progress")
    private double downloadProgress;

    // Getters and setters
    public String getFileName() { return fileName; }
    public void setFileName(String fileName) { this.fileName = fileName; }

    public long getFileSize() { return fileSize; }
    public void setFileSize(long fileSize) { this.fileSize = fileSize; }

    public int getPieceLength() { return pieceLength; }
    public void setPieceLength(int pieceLength) { this.pieceLength = pieceLength; }

    public List<Piece> getPieces() { return pieces; }
    public void setPieces(List<Piece> pieces) { this.pieces = pieces; }

    public String getCreatedAt() { return createdAt; }
    public void setCreatedAt(String createdAt) { this.createdAt = createdAt; }

    public double getDownloadProgress() { return downloadProgress; }
    public void setDownloadProgress(double downloadProgress) { this.downloadProgress = downloadProgress; }

    // Inner class for the "pieces" array
    public static class Piece {

        @SerializedName("index")
        private int index;

        @SerializedName("hash")
        private String hash;

        @SerializedName("status")
        private String status;

        @SerializedName("peers")
        private List<String> peers;

        // Getters and setters
        public int getIndex() { return index; }
        public void setIndex(int index) { this.index = index; }

        public String getHash() { return hash; }
        public void setHash(String hash) { this.hash = hash; }

        public String getStatus() { return status; }
        public void setStatus(String status) { this.status = status; }

        public List<String> getPeers() { return peers; }
        public void setPeers(List<String> peers) { this.peers = peers; }
    }
}

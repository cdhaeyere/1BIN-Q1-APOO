import java.util.ArrayList;
import java.util.List;

public class Site {

    private String url;
    private List<ContenuVideo> contenusVideo;

    public Site(String url) {
        if (url.equals("")) throw new IllegalArgumentException();
        this.url = url;
        contenusVideo = new ArrayList<>();
    }

    public boolean ajouter(ContenuVideo contenuVideo) {
        if (contenuVideo == null) throw new IllegalArgumentException();
        contenusVideo.add(contenuVideo);
        return true;
    }

    public boolean effacer(ContenuVideo contenuVideo) {
        if (contenuVideo == null) throw new IllegalArgumentException();
        if (contenusVideo.contains(contenuVideo)) {
            contenusVideo.remove(contenuVideo);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        if (contenusVideo.isEmpty()) {
            return "Site [url=" + url + "]\n" + "Liste de contenus vidéos\n Aucun contenu vidéo";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Site [url=" + url + "]\n" + "Liste de contenus vidéos\n ");
        for (ContenuVideo contenuVideo: contenusVideo) {
            sb.append(contenuVideo.toString() + "\n ");
        }
        return sb.toString();
    }
}

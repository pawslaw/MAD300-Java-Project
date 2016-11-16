package client;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class GameForm extends GridPane {
	Label titleLabel;
	TextField gameTitle;
	ObservableList<String> genres;
	ListView<String> genreList;
	
	
	public GameForm() {
		this.setPadding(new Insets(10));
		this.setVgap(15);
		this.setHgap(15);
		
		this.titleLabel = new Label("Game Title:");
		
		this.gameTitle = new TextField();
		this.genres = FXCollections.observableArrayList("Board Game","Card Game","Video Game");
		this.genreList = new ListView<>(genres);
		this.genreList.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		this.genreList.setMaxHeight(75);
		this.genreList.setOnMouseClicked(e->{
			ObservableList<String> selectedGenres = genreList.getSelectionModel().getSelectedItems();
			for(String genreString : selectedGenres) {
				System.out.println(genreString);
			}
		});
		
		
		this.add(titleLabel, 0, 0);
		this.add(genreList, 2, 2);
	}

}
import org.eclipse.gef.palette.CombinedTemplateCreationEntry;
import org.eclipse.gef.palette.MarqueeToolEntry;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteEntry;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PaletteToolbar;
import org.eclipse.gef.palette.PanningSelectionToolEntry;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gef.requests.SimpleFactory;

import genalogyModel.GenalogyModelFactory;
import genalogyModel.Marriage;
import genalogyModel.Note;
import genalogyModel.Person;

public class GenealogyGraphEditorPaletteFactory {

	public static PaletteRoot createPalette() {
		PaletteRoot palette = new PaletteRoot();
		palette.add(createToolsGroup(palette));
		palette.add(createElementsDrawer());
		return palette;
	}

	private static PaletteEntry createToolsGroup(PaletteRoot palette) {
		PaletteToolbar toolbar = new PaletteToolbar("Tools");
		ToolEntry tool = new PanningSelectionToolEntry();
		toolbar.add(tool);
		palette.setDefaultEntry(tool);
		toolbar.add(new MarqueeToolEntry());
		return toolbar;
	}

	private static PaletteEntry createElementsDrawer() {
		PaletteDrawer componentsDrawer = new PaletteDrawer("Elements");

		SimpleFactory personfactory = new SimpleFactory(Person.class) {
			@Override
			public Object getNewObject() {
				Person person = GenalogyModelFactory.eINSTANCE.createPerson();
				person.setName("Jane Smith");

				return person;
			}
		};
		CombinedTemplateCreationEntry personcomponent = new CombinedTemplateCreationEntry("person",
				"Add a new person to the Genealogy Graph", personfactory, null, null);
		componentsDrawer.add(personcomponent);

		SimpleFactory Marriagefactory = new SimpleFactory(Marriage.class) {
			@Override
			public Object getNewObject() {
				Marriage marriage = GenalogyModelFactory.eINSTANCE.createMarriage();
				marriage.setYearMarried(1900);

				return marriage;
			}
		};

		CombinedTemplateCreationEntry marriageComponent = new CombinedTemplateCreationEntry("Marriage",
				"Add a new Marriage to the Genealogy Graph", Marriagefactory, null, null);

		componentsDrawer.add(marriageComponent);

		SimpleFactory notefactory = new SimpleFactory(Note.class) {
			@Override
			public Object getNewObject() {
				Note note = GenalogyModelFactory.eINSTANCE.createNote();
				note.setText("this is  a note");

				return note;
			}
		};
		CombinedTemplateCreationEntry noteComponent = new CombinedTemplateCreationEntry("note", "Add a new note",
				notefactory, null, null);

		componentsDrawer.add(noteComponent);
		return componentsDrawer;
	}
}

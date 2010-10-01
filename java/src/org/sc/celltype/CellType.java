package org.sc.celltype;

import org.sc.obo.annotations.Relates;
import org.sc.obo.annotations.Term;

@Term
interface Cell {
	public static String id = "CL:0000000";
	public static String name = "cell";
	public static String def = "\"Anatomical structure that has as its parts a maximally connected cell compartment surrounded by a plasma membrane.\" [CARO:mah]";
}


@Term
interface PrimaryCellLineCell extends CellLineCell {
	public static String id = "CL:0000001";
	public static String name = "primary cell line cell";
	public static String def = "";
}


@Term
interface PermanentCellLineCell extends CellLineCell {
	public static String id = "CL:0000002";
	public static String name = "permanent cell line cell";
	public static String def = "";
}


@Term
interface CellInVivo extends Cell {
	public static String id = "CL:0000003";
	public static String name = "cell in vivo";
	public static String def = "";
}


@Term
interface CellByOrganism extends CellInVivo {
	public static String id = "CL:0000004";
	public static String name = "cell by organism";
	public static String def = "\"A classification of cells by the organisms within which they are contained.\" [FB:ma]";
}


@Term
interface FibroblastNeuralCrestDerived extends Fibroblast {
	public static String id = "CL:0000005";
	public static String name = "fibroblast neural crest derived";
	public static String def = "";

	@Relates("develops_from")
	public CranialNeuralCrestCell FibroblastNeuralCrestDerived_develops_from();
}


@Term
interface ReceptorCellSensuAnimalia extends Neuron {
	public static String id = "CL:0000006";
	public static String name = "receptor cell (sensu Animalia)";
	public static String def = "";
}


@Term
interface EarlyEmbryonicCell extends AnimalCell {
	public static String id = "CL:0000007";
	public static String name = "early embryonic cell";
	public static String def = "";
}


@Term
interface CranialNeuralCrestCell extends NeuralCrestCell {
	public static String id = "CL:0000008";
	public static String name = "cranial neural crest cell";
	public static String def = "";
}


@Term
interface FusiformInitial extends CambialInitial, PlantCell {
	public static String id = "CL:0000009";
	public static String name = "fusiform initial";
	public static String def = "\"An elongated cell with approximately wedge-shaped ends, found in the vascular cambium, which gives rise to the elements of the axial system in the secondary vascular tissues.\" [ISBN:0471245208]";
}


@Term
interface CellLineCell extends ExperimentallyModifiedCell {
	public static String id = "CL:0000010";
	public static String name = "cell line cell";
	public static String def = "";
}


@Term
interface TrunkNeuralCrestCell extends NeuralCrestCell {
	public static String id = "CL:0000011";
	public static String name = "trunk neural crest cell";
	public static String def = "";
}


@Term
interface CellByClass extends CellInVivo {
	public static String id = "CL:0000012";
	public static String name = "cell by class";
	public static String def = "";
}


@Term
interface DentineSecretingCell extends SecretoryCell {
	public static String id = "CL:0000013";
	public static String name = "dentine secreting cell";
	public static String def = "";
}


@Term
interface GermLineStemCell extends StemCell, GermLineCell {
	public static String id = "CL:0000014";
	public static String name = "germ line stem cell";
	public static String def = "";
}


@Term
interface MaleGermCell extends GermCell {
	public static String id = "CL:0000015";
	public static String name = "male germ cell";
	public static String def = "";
}


@Term
interface MaleGermLineStemCell extends GermLineStemCell, MaleGermCell {
	public static String id = "CL:0000016";
	public static String name = "male germ line stem cell";
	public static String def = "";
}


@Term
interface Spermatocyte extends MaleGermCell {
	public static String id = "CL:0000017";
	public static String name = "spermatocyte";
	public static String def = "\"A male germ cell that develops from spermatogonia. The euploid primary spermatocytes undergo meiosis and give rise to the haploid secondary spermatocytes which in turn give rise to spermatids.\" [MESH:A.05.360.490.890.880]";
}


@Term
interface Spermatid extends MaleGermCell {
	public static String id = "CL:0000018";
	public static String name = "spermatid";
	public static String def = "\"A male germ cell that develops from the haploid secondary spermatocytes. Without further division, spermatids undergo structural changes and give rise to spermatozoa.\" [MESH:A.05.360.490.890.860]";
}


@Term
interface Sperm extends MaleGermCell, MaleGamete {
	public static String id = "CL:0000019";
	public static String name = "sperm";
	public static String def = "\"A mature male germ cell that develops from a spermatid.\" [MESH:A.05.360.490.890]";
}


@Term
interface Spermatogonium extends MaleGermCell {
	public static String id = "CL:0000020";
	public static String name = "spermatogonium";
	public static String def = "\"An euploid male germ cell of an early stage of spermatogenesis.\" [MESH:A.05.360.490.890.900]";
}


@Term
interface FemaleGermCell extends GermCell {
	public static String id = "CL:0000021";
	public static String name = "female germ cell";
	public static String def = "";
}


@Term
interface FemaleGermLineStemCell extends GermLineStemCell, FemaleGermCell {
	public static String id = "CL:0000022";
	public static String name = "female germ line stem cell";
	public static String def = "";
}


@Term
interface Oocyte extends FemaleGermCell {
	public static String id = "CL:0000023";
	public static String name = "oocyte";
	public static String def = "";
}


@Term
interface OogonialCell extends FemaleGermCell {
	public static String id = "CL:0000024";
	public static String name = "oogonial cell";
	public static String def = "";
}


@Term
interface Egg extends FemaleGamete {
	public static String id = "CL:0000025";
	public static String name = "egg";
	public static String def = "";
}


@Term
interface NurseCell extends PolyploidCell, AnimalCell {
	public static String id = "CL:0000026";
	public static String name = "nurse cell";
	public static String def = "";

	@Relates("develops_from")
	public Cystoblast NurseCell_develops_from();
}


@Term
interface SmoothMuscleCellNeuralCrestDerived extends SmoothMuscleCell {
	public static String id = "CL:0000027";
	public static String name = "smooth muscle cell neural crest derived";
	public static String def = "";

	@Relates("develops_from")
	public CranialNeuralCrestCell SmoothMuscleCellNeuralCrestDerived_develops_from();
}


@Term
interface CNSNeuronSensuNematodaAndProtostomia extends Neuron {
	public static String id = "CL:0000028";
	public static String name = "CNS neuron (sensu Nematoda and Protostomia)";
	public static String def = "";

	@Relates("develops_from")
	public NeuroblastSensuNematodaAndProtostomia CNSNeuronSensuNematodaAndProtostomia_develops_from();
}


@Term
interface NeuronNeuralCrestDerived extends Neuron {
	public static String id = "CL:0000029";
	public static String name = "neuron neural crest derived";
	public static String def = "";

	@Relates("develops_from")
	public NeuralCrestCell NeuronNeuralCrestDerived_develops_from();
}


@Term
interface Glioblast extends NonTerminallyDifferentiatedCell {
	public static String id = "CL:0000030";
	public static String name = "glioblast";
	public static String def = "";

	@Relates("develops_from")
	public NeurectodermalCell Glioblast_develops_from();
}


@Term
interface Neuroblast extends NeuronalStemCell, NonTerminallyDifferentiatedCell {
	public static String id = "CL:0000031";
	public static String name = "neuroblast";
	public static String def = "";
}


@Term
interface NeuroplacodalCell extends AnimalCell {
	public static String id = "CL:0000032";
	public static String name = "neuroplacodal cell";
	public static String def = "";

	@Relates("develops_from")
	public SurfaceEctodermalCell NeuroplacodalCell_develops_from();
}


@Term
interface ApocrineCell extends SecretoryCell {
	public static String id = "CL:0000033";
	public static String name = "apocrine cell";
	public static String def = "";
}


@Term
interface StemCell extends CellByClass {
	public static String id = "CL:0000034";
	public static String name = "stem cell";
	public static String def = "\"A relatively undifferentiated cell that retains the ability to divide and proliferate throughout life to provide progenitor cells that can differentiate into specialized cells.\" [MESH:A.11.872]";
}


@Term
interface SingleFateStemCell extends SomaticStemCell {
	public static String id = "CL:0000035";
	public static String name = "single fate stem cell";
	public static String def = "";
}


@Term
interface EpithelialFateStemCell extends SingleFateStemCell {
	public static String id = "CL:0000036";
	public static String name = "epithelial fate stem cell";
	public static String def = "";
}


@Term
interface HematopoieticStemCell extends MultiFateStemCell {
	public static String id = "CL:0000037";
	public static String name = "hematopoietic stem cell";
	public static String def = "\"A stem cell from which all cells of the lymphoid and myeloid lineages develop, including blood cells and cells of the immune system.\" [GOC:add]";

	@Relates("develops_from")
	public AngioblasticMesenchymalCell HematopoieticStemCell_develops_from();
}


@Term
interface ErythroidProgenitorCell extends MyeloidProgenitorCell {
	public static String id = "CL:0000038";
	public static String name = "erythroid progenitor cell";
	public static String def = "\"A progenitor cell committed to the erythroid lineage.\" [GOC:add, ISBN:0721601464]";

	@Relates("develops_from")
	public MegakaryocyteErythroidProgenitorCell ErythroidProgenitorCell_develops_from();
}


@Term
interface GermLineCell extends CellByFunction {
	public static String id = "CL:0000039";
	public static String name = "germ line cell";
	public static String def = "";
}


@Term
interface Monoblast extends MyeloidProgenitorCell {
	public static String id = "CL:0000040";
	public static String name = "monoblast";
	public static String def = "\"A myeloid progenitor cell committed to the monocyte lineage.\" [GOC:add, http://www.clt.astate.edu/wwilliam/, http://www.copewithcytokines.de, PMID:1104740]";

	@Relates("develops_from")
	public GranulocyteMonocyteProgenitorCell Monoblast_develops_from();
}


@Term
interface MatureEosinophil extends Eosinophil {
	public static String id = "CL:0000041";
	public static String name = "mature eosinophil";
	public static String def = "\"A fully differentiated eosinophil, a granular leukocyte with a nucleus that usually has two lobes connected by one or more slender threads of chromatin, and cytoplasm containing coarse, round granules that are uniform in size and which can be stained by the dye eosin.\" [GOC:add, ISBN:0721601464]";

	@Relates("develops_from")
	public ImmatureEosinophil MatureEosinophil_develops_from();

	@Relates("develops_from")
	public BandFormEosinophil MatureEosinophil_develops_from_1();
}


@Term
interface NeutrophilicMyeloblast extends Myeloblast {
	public static String id = "CL:0000042";
	public static String name = "neutrophilic myeloblast";
	public static String def = "\"A myeloblast committed to the neutrophil lineage. A myeloblast is the most primitive precursor in the granulocytic series, having fine, evenly distributed chromatin, several nucleoli, and a nongranular basophilic cytoplasm.\" [GOC:add, ISBN:0721601464]";

	@Relates("develops_from")
	public NeutrophilProgenitorCell NeutrophilicMyeloblast_develops_from();
}


@Term
interface MatureBasophil extends Basophil {
	public static String id = "CL:0000043";
	public static String name = "mature basophil";
	public static String def = "\"A fully differentiated basophil, a granular leukocyte with an irregularly shaped, pale-staining nucleus that is partially constricted into two lobes, and with cytoplasm that contains coarse, bluish-black granules of variable size. Basophils contain vasoactive amines such as histamine and serotonin, which are released on appropriate stimulation.\" [GOC:add, ISBN:0721601464]";

	@Relates("develops_from")
	public ImmatureBasophil MatureBasophil_develops_from();

	@Relates("develops_from")
	public BandFormBasophil MatureBasophil_develops_from_1();
}


@Term
interface NeuronalStemCell extends MultiFateStemCell {
	public static String id = "CL:0000047";
	public static String name = "neuronal stem cell";
	public static String def = "";

	@Relates("develops_from")
	public NeurectodermalCell NeuronalStemCell_develops_from();
}


@Term
interface MultiFateStemCell extends SomaticStemCell {
	public static String id = "CL:0000048";
	public static String name = "multi fate stem cell";
	public static String def = "\"A stem cell that can give rise to mulitple lineages of cells.\" [GOC:add]";
}


@Term
interface CommonMyeloidProgenitor extends MyeloidProgenitorCell {
	public static String id = "CL:0000049";
	public static String name = "common myeloid progenitor";
	public static String def = "\"A progenitor cell committed to myeloid lineage, including the megakaryocyte and erythroid lineages.\" [GOC:add, ISBN:0878932437, PMID:10724173]";

	@Relates("develops_from")
	public HematopoieticStemCell CommonMyeloidProgenitor_develops_from();
}


@Term
interface MegakaryocyteErythroidProgenitorCell extends MyeloidProgenitorCell {
	public static String id = "CL:0000050";
	public static String name = "megakaryocyte erythroid progenitor cell";
	public static String def = "\"A progenitor cell committed to the megakaryocyte and erythroid lineages.\" [GOC:add]";

	@Relates("develops_from")
	public CommonMyeloidProgenitor MegakaryocyteErythroidProgenitorCell_develops_from();
}


@Term
interface CommonLymphoidProgenitor extends LymphoidProgenitorCell {
	public static String id = "CL:0000051";
	public static String name = "common lymphoid progenitor";
	public static String def = "\"A progenitor cell committed to the lymphoid lineage with phenotype Lin-negative, CD117-low, Sca-1-low and CD127-positive.\" [GOC:add, PMID:10407577]";

	@Relates("develops_from")
	public EarlyLymphoidProgenitor CommonLymphoidProgenitor_develops_from();
}


@Term
interface TotipotentStemCell extends SomaticStemCell {
	public static String id = "CL:0000052";
	public static String name = "totipotent stem cell";
	public static String def = "\"A stem cell from which all cells of the body can form.\" [GOC:add]";
}


@Term
interface EnamelSecretingCell extends SecretoryCell {
	public static String id = "CL:0000053";
	public static String name = "enamel secreting cell";
	public static String def = "";
}


@Term
interface BoneMatrixSecretingCell extends SecretoryCell {
	public static String id = "CL:0000054";
	public static String name = "bone matrix secreting cell";
	public static String def = "";
}


@Term
interface NonTerminallyDifferentiatedCell extends CellByClass {
	public static String id = "CL:0000055";
	public static String name = "non-terminally differentiated cell";
	public static String def = "\"A precursor cell with a limited number of potential fates.\" [SANBI:mhl]";
}


@Term
interface Myoblast extends NonTerminallyDifferentiatedCell {
	public static String id = "CL:0000056";
	public static String name = "myoblast";
	public static String def = "\"An embryonic (precursor) cell of the myogenic lineage that develops from the mesoderm. They undergo proliferation, migrate to their various sites, and then differentiate into the appropriate form of myocytes.\" [MESH:A.11.635]";

	@Relates("develops_from")
	public MuscleStemCell Myoblast_develops_from();
}


@Term
interface Fibroblast extends NonTerminallyDifferentiatedCell {
	public static String id = "CL:0000057";
	public static String name = "fibroblast";
	public static String def = "\"A connective tissue cell which secretes an extracellular matrix rich in collagen and other macromolecules.\" [MESH:A.11.329.228]";

	@Relates("develops_from")
	public MesenchymalCell Fibroblast_develops_from();
}


@Term
interface Chondroblast extends NonTerminallyDifferentiatedCell, AnimalCell {
	public static String id = "CL:0000058";
	public static String name = "chondroblast";
	public static String def = "";

	@Relates("develops_from")
	public MesenchymalCell Chondroblast_develops_from();

	@Relates("develops_from")
	public MesodermalCell Chondroblast_develops_from_1();
}


@Term
interface Ameloblast extends NonTerminallyDifferentiatedCell, AnimalCell {
	public static String id = "CL:0000059";
	public static String name = "ameloblast";
	public static String def = "\"A cylindrical epithelial cell in the innermost layer of the enamel organ. Their functions include contribution to the development of the dentinoenamel junction by the deposition of a layer of the matrix, thus producing the foundation for the prisms (the structural units of the dental enamel), and production of the matrix for the enamel prisms and interprismatic substance. (From Jablonski's Dictionary of Dentistry, 1992).\" [MESH:A.11.436.107]";

	@Relates("develops_from")
	public NeuralCrestCell Ameloblast_develops_from();
}


@Term
interface Odontoblast extends NonTerminallyDifferentiatedCell {
	public static String id = "CL:0000060";
	public static String name = "odontoblast";
	public static String def = "";

	@Relates("develops_from")
	public CranialNeuralCrestCell Odontoblast_develops_from();
}


@Term
interface Cementoblast extends Osteoblast {
	public static String id = "CL:0000061";
	public static String name = "cementoblast";
	public static String def = "\"A cell of ectomesenchymal origin concerned with the formation of the layer of cementum on the roots of teeth.\" [ISBN:0781733901 \"Stedman's Medical Dictionary\"]";
}


@Term
interface Osteoblast extends NonTerminallyDifferentiatedCell {
	public static String id = "CL:0000062";
	public static String name = "osteoblast";
	public static String def = "\"A bone-forming cell which secretes an extracellular matrix. Hydroxyapatite crystals are then deposited into the matrix to form bone.\" [MESH:A.11.329.629]";

	@Relates("develops_from")
	public CranialNeuralCrestCell Osteoblast_develops_from();

	@Relates("develops_from")
	public OsteoprogenitorCell Osteoblast_develops_from_1();
}


@Term
interface CellByHistology extends CellByClass {
	public static String id = "CL:0000063";
	public static String name = "cell by histology";
	public static String def = "\"A classification of cells by their microscopical appearance.\" [FB:ma]";
}


@Term
interface CiliatedCell extends AnimalCell {
	public static String id = "CL:0000064";
	public static String name = "ciliated cell";
	public static String def = "";
}


@Term
interface EpendymalCell extends CiliatedEpithelialCell {
	public static String id = "CL:0000065";
	public static String name = "ependymal cell";
	public static String def = "\"A neurectoderm derived cell that lines the neural lumen.\" [JB:jb, PMID:9550134]";

	@Relates("develops_from")
	public NeuroepithelialCell EpendymalCell_develops_from();
}


@Term
interface EpithelialCell extends CellByHistology {
	public static String id = "CL:0000066";
	public static String name = "epithelial cell";
	public static String def = "\"A cell that is usually found in a two-dimensional sheet with a free surface.\" [FB:ma, MESH:A.11.436]";
}


@Term
interface CiliatedEpithelialCell extends CiliatedCell, ColumnarCuboidalEpithelialCell {
	public static String id = "CL:0000067";
	public static String name = "ciliated epithelial cell";
	public static String def = "";
}


@Term
interface DuctEpithelialCell extends EpithelialCell, AnimalCell {
	public static String id = "CL:0000068";
	public static String name = "duct epithelial cell";
	public static String def = "";
}


@Term
interface BranchedDuctEpithelialCell extends DuctEpithelialCell {
	public static String id = "CL:0000069";
	public static String name = "branched duct epithelial cell";
	public static String def = "";

	@Relates("develops_from")
	public EctodermalCell BranchedDuctEpithelialCell_develops_from();

	@Relates("develops_from")
	public MesodermalCell BranchedDuctEpithelialCell_develops_from_1();

	@Relates("develops_from")
	public EndodermalCell BranchedDuctEpithelialCell_develops_from_2();
}


@Term
interface BloodVesselEndothelialCell extends SquamousEpithelialCell, EndothelialCell {
	public static String id = "CL:0000071";
	public static String name = "blood vessel endothelial cell";
	public static String def = "";

	@Relates("develops_from")
	public MesodermalCell BloodVesselEndothelialCell_develops_from();
}


@Term
interface NonBranchedDuctEpithelialCell extends DuctEpithelialCell {
	public static String id = "CL:0000072";
	public static String name = "non-branched duct epithelial cell";
	public static String def = "";

	@Relates("develops_from")
	public MesodermalCell NonBranchedDuctEpithelialCell_develops_from();
}


@Term
interface BarrierEpithelialCell extends AnimalCell {
	public static String id = "CL:0000073";
	public static String name = "barrier epithelial cell";
	public static String def = "";
}


@Term
interface EpithemCell extends SecretoryCell, PlantCell {
	public static String id = "CL:0000074";
	public static String name = "epithem cell";
	public static String def = "\"A cell that constitutes the mesophyll of a hydathode and is located between the xylem endings and the epidermis. Proposed to be involved in the retrieval of solutes from the xylem sap.\" [ISBN:0471245208, PMID:12662305]";
}


@Term
interface ColumnarCuboidalEpithelialCell extends EpithelialCell {
	public static String id = "CL:0000075";
	public static String name = "columnar/cuboidal epithelial cell";
	public static String def = "";
}


@Term
interface SquamousEpithelialCell extends EpithelialCell {
	public static String id = "CL:0000076";
	public static String name = "squamous epithelial cell";
	public static String def = "";
}


@Term
interface MesothelialCell extends SquamousEpithelialCell, LiningCell {
	public static String id = "CL:0000077";
	public static String name = "mesothelial cell";
	public static String def = "";

	@Relates("develops_from")
	public MesodermalCell MesothelialCell_develops_from();
}


@Term
interface PeridermalCell extends SquamousEpithelialCell {
	public static String id = "CL:0000078";
	public static String name = "peridermal cell";
	public static String def = "";
}


@Term
interface StratifiedEpithelialCell extends EpithelialCell {
	public static String id = "CL:0000079";
	public static String name = "stratified epithelial cell";
	public static String def = "";

	@Relates("develops_from")
	public StratifiedEpithelialStemCell StratifiedEpithelialCell_develops_from();
}


@Term
interface CirculatingCell extends CellByFunction, AnimalCell {
	public static String id = "CL:0000080";
	public static String name = "circulating cell";
	public static String def = "\"A cell which moves among different tissues of the body, via blood, lymph, or other medium.\" [GOC:add]";
}


@Term
interface BloodCell extends CirculatingCell, HematopoieticCell {
	public static String id = "CL:0000081";
	public static String name = "blood cell";
	public static String def = "\"A cell found predominately in the blood.\" [GOC:add]";
}


@Term
interface EpithelialCellOfLung extends EpithelialCell {
	public static String id = "CL:0000082";
	public static String name = "epithelial cell of lung";
	public static String def = "";

	@Relates("develops_from")
	public EndodermalCell EpithelialCellOfLung_develops_from();
}


@Term
interface EpithelialCellOfPancreas extends EpithelialCell {
	public static String id = "CL:0000083";
	public static String name = "epithelial cell of pancreas";
	public static String def = "";

	@Relates("develops_from")
	public EndodermalCell EpithelialCellOfPancreas_develops_from();
}


@Term
interface TCell extends Lymphocyte {
	public static String id = "CL:0000084";
	public static String name = "T cell";
	public static String def = "\"A type of lymphocyte whose defining characteristic is the expression of a T cell receptor complex.\" [GOC:add, ISBN:0781735149]";

	@Relates("develops_from")
	public ProTCell TCell_develops_from();
}


@Term
interface GermLineStemCellSensuVertebrata extends GermLineStemCell, ExtraembryonicCell, AnimalCell {
	public static String id = "CL:0000085";
	public static String name = "germ line stem cell (sensu Vertebrata)";
	public static String def = "";
}


@Term
interface GermLineStemCellSensuNematodaAndProtostomia extends GermLineStemCell, AnimalCell {
	public static String id = "CL:0000086";
	public static String name = "germ line stem cell (sensu Nematoda and Protostomia)";
	public static String def = "";
}


@Term
interface MaleGermLineStemCellSensuNematodaAndProtostomia extends MaleGermLineStemCell, GermLineStemCellSensuNematodaAndProtostomia {
	public static String id = "CL:0000087";
	public static String name = "male germ line stem cell (sensu Nematoda and Protostomia)";
	public static String def = "";
}


@Term
interface FemaleGermLineStemCellSensuNematodaAndProtostomia extends FemaleGermLineStemCell, GermLineStemCellSensuNematodaAndProtostomia {
	public static String id = "CL:0000088";
	public static String name = "female germ line stem cell (sensu Nematoda and Protostomia)";
	public static String def = "";
}


@Term
interface MaleGermLineStemCellSensuVertebrata extends MaleGermLineStemCell, GermLineStemCellSensuVertebrata {
	public static String id = "CL:0000089";
	public static String name = "male germ line stem cell (sensu Vertebrata)";
	public static String def = "";
}


@Term
interface FemaleGermLineStemCellSensuVertebrata extends FemaleGermLineStemCell, GermLineStemCellSensuVertebrata {
	public static String id = "CL:0000090";
	public static String name = "female germ line stem cell (sensu Vertebrata)";
	public static String def = "";
}


@Term
interface KupfferCell extends TissueResidentMacrophage {
	public static String id = "CL:0000091";
	public static String name = "Kupffer cell";
	public static String def = "\"A tissue-resident macrophage of the reticuloendothelial system found on the luminal surface of the hepatic sinusoids.\" [GO_REF:0000031, GOC:add, MESH:A.11.329.372.588, PMID:15771589, PMID:17105582]";
}


@Term
interface Osteoclast extends MyeloidLeukocyte {
	public static String id = "CL:0000092";
	public static String name = "osteoclast";
	public static String def = "\"A specialized phagocytic cell associated with the absorption and removal of the mineralized matrix of bone tissue, which typically differentiates from monocytes.\" [GO_REF:0000031, GOC:add, ISBN:0781735149, PMID:10428500, PMID:15055519, PMID:17380158]";

	@Relates("develops_from")
	public Monocyte Osteoclast_develops_from();
}


@Term
interface Granulocyte extends MyeloidLeukocyte {
	public static String id = "CL:0000094";
	public static String name = "granulocyte";
	public static String def = "\"A leukocyte with abundant granules in the cytoplasm.\" [MESH:A.11.118.637.415]";
}


@Term
interface NeuronAssociatedCell {
	public static String id = "CL:0000095";
	public static String name = "neuron associated cell";
	public static String def = "";

	@Relates("develops_from")
	public NeurectodermalCell NeuronAssociatedCell_develops_from();
}


@Term
interface MatureNeutrophil extends Neutrophil {
	public static String id = "CL:0000096";
	public static String name = "mature neutrophil";
	public static String def = "\"A fully differentiated neutrophil, a granular leukocyte having a nucleus with three to five lobes connected by slender threads of chromatin, and cytoplasm containing fine inconspicuous granules and stainable by neutral dyes.\" [GOC:add, MESH:A.11.118.637.415.583]";

	@Relates("develops_from")
	public BandFormNeutrophil MatureNeutrophil_develops_from();

	@Relates("develops_from")
	public ImmatureNeutrophil MatureNeutrophil_develops_from_1();
}


@Term
interface MastCell extends MyeloidLeukocyte {
	public static String id = "CL:0000097";
	public static String name = "mast cell";
	public static String def = "\"A cell that is found in almost all tissues containing numerous basophilic granules and capable of releasing large amounts of histamine and heparin upon activation.\" [GOC:add, ISBN:068340007X, MESH:A.11.329.427]";

	@Relates("develops_from")
	public MastCellProgenitor MastCell_develops_from();
}


@Term
interface SensoryEpithelialCell extends ColumnarCuboidalEpithelialCell {
	public static String id = "CL:0000098";
	public static String name = "sensory epithelial cell";
	public static String def = "";

	@Relates("develops_from")
	public NeuroepithelialCell SensoryEpithelialCell_develops_from();
}


@Term
interface Interneuron extends Neuron {
	public static String id = "CL:0000099";
	public static String name = "interneuron";
	public static String def = "\"Most generally any neuron which is not motor or sensory. Interneurons may also refer to neurons whose axons remain within a particular brain region as contrasted with projection neurons which have axons projecting to other brain regions.\" [MESH:A.08.663.358]";
}


@Term
interface MotorNeuron extends EfferentNeuron {
	public static String id = "CL:0000100";
	public static String name = "motor neuron";
	public static String def = "\"An efferent neuron that passes from the central nervous system or a ganglion toward or to a muscle and conducts an impulse that causes movement.\" [MESH:A.08.663.655.500, PMID:16875686]";
}


@Term
interface SensoryNeuron extends AfferentNeuron {
	public static String id = "CL:0000101";
	public static String name = "sensory neuron";
	public static String def = "";
}


@Term
interface PolymodalNeuron extends Neuron {
	public static String id = "CL:0000102";
	public static String name = "polymodal neuron";
	public static String def = "";
}


@Term
interface BipolarNeuron extends CellByHistology, Interneuron {
	public static String id = "CL:0000103";
	public static String name = "bipolar neuron";
	public static String def = "\"A type of interneuron that has two neurites, usually an axon and a dendrite, extending from opposite poles of an ovoid cell body.\" [ISBN:0444009442]";
}


@Term
interface MultipolarNeuron extends Neuron {
	public static String id = "CL:0000104";
	public static String name = "multipolar neuron";
	public static String def = "";
}


@Term
interface PseudounipolarNeuron extends Neuron {
	public static String id = "CL:0000105";
	public static String name = "pseudounipolar neuron";
	public static String def = "";
}


@Term
interface UnipolarNeuron extends Neuron {
	public static String id = "CL:0000106";
	public static String name = "unipolar neuron";
	public static String def = "";
}


@Term
interface AutonomicNeuron extends NeuronNeuralCrestDerived {
	public static String id = "CL:0000107";
	public static String name = "autonomic neuron";
	public static String def = "";
}


@Term
interface CholinergicNeuron extends AutonomicNeuron {
	public static String id = "CL:0000108";
	public static String name = "cholinergic neuron";
	public static String def = "";
}


@Term
interface AdrenergicNeuron extends AutonomicNeuron {
	public static String id = "CL:0000109";
	public static String name = "adrenergic neuron";
	public static String def = "";
}


@Term
interface PeptidergicNeuron extends AutonomicNeuron {
	public static String id = "CL:0000110";
	public static String name = "peptidergic neuron";
	public static String def = "";
}


@Term
interface PeripheralNeuron extends NeuronNeuralCrestDerived {
	public static String id = "CL:0000111";
	public static String name = "peripheral neuron";
	public static String def = "";
}


@Term
interface ColumnarNeuron extends Neuron {
	public static String id = "CL:0000112";
	public static String name = "columnar neuron";
	public static String def = "";
}


@Term
interface MononuclearPhagocyte extends SingleNucleateCell, PhagocyteSensuVertebrata, MononuclearCell {
	public static String id = "CL:0000113";
	public static String name = "mononuclear phagocyte";
	public static String def = "\"A vertebrate phagocyte with a single nucleus.\" [GOC:add, ISBN:0781735149]";
}


@Term
interface SurfaceEctodermalCell extends EctodermalCell {
	public static String id = "CL:0000114";
	public static String name = "surface ectodermal cell";
	public static String def = "";
}


@Term
interface EndothelialCell extends LiningCell {
	public static String id = "CL:0000115";
	public static String name = "endothelial cell";
	public static String def = "";
}


@Term
interface PioneerNeuron extends Neuron {
	public static String id = "CL:0000116";
	public static String name = "pioneer neuron";
	public static String def = "";
}


@Term
interface CNSNeuronSensuVertebrata extends Neuron {
	public static String id = "CL:0000117";
	public static String name = "CNS neuron (sensu Vertebrata)";
	public static String def = "";

	@Relates("develops_from")
	public NeuroblastSensuVertebrata CNSNeuronSensuVertebrata_develops_from();
}


@Term
interface BasketCell extends CNSNeuronSensuVertebrata {
	public static String id = "CL:0000118";
	public static String name = "basket cell";
	public static String def = "";
}


@Term
interface GolgiCell extends CNSNeuronSensuVertebrata {
	public static String id = "CL:0000119";
	public static String name = "Golgi cell";
	public static String def = "";
}


@Term
interface GranuleCell extends CNSNeuronSensuVertebrata {
	public static String id = "CL:0000120";
	public static String name = "granule cell";
	public static String def = "";
}


@Term
interface PurkinjeCell extends CNSNeuronSensuVertebrata, EfferentNeuron {
	public static String id = "CL:0000121";
	public static String name = "Purkinje cell";
	public static String def = "\"The output neuron of the cerebellar cortex.\" [MESH:A.08.186.211.132.810.428.200.212.600]";
}


@Term
interface StellateCell extends CNSNeuronSensuVertebrata {
	public static String id = "CL:0000122";
	public static String name = "stellate cell";
	public static String def = "";
}


@Term
interface NeuronAssociatedCellSensuVertebrata {
	public static String id = "CL:0000123";
	public static String name = "neuron associated cell (sensu Vertebrata)";
	public static String def = "";

	@Relates("develops_from")
	public NeuronAssociatedCell NeuronAssociatedCellSensuVertebrata_develops_from();

	@Relates("develops_from")
	public NeuralCrestCell NeuronAssociatedCellSensuVertebrata_develops_from_1();
}


@Term
interface GlialCellSensuNematodaAndProtostomia extends GlialCell, GlioblastSensuNematodaAndProtostomia {
	public static String id = "CL:0000124";
	public static String name = "glial cell (sensu Nematoda and Protostomia)";
	public static String def = "";
}


@Term
interface GlialCell {
	public static String id = "CL:0000125";
	public static String name = "glial cell";
	public static String def = "\"A non-neuronal cell of the nervous system. They not only provide physical support, but also respond to injury, regulate the ionic and chemical composition of the extracellular milieu. Guide neuronal migration during development, and exchange metabolites with neurons.\" [MESH:A.08.637]";

	@Relates("develops_from")
	public Glioblast GlialCell_develops_from();
}


@Term
interface MacroglialCell extends GlialCellSensuVertebrata {
	public static String id = "CL:0000126";
	public static String name = "macroglial cell";
	public static String def = "";

	@Relates("develops_from")
	public GlioblastSensuVertebrata MacroglialCell_develops_from();
}


@Term
interface Astrocyte extends MacroglialCell {
	public static String id = "CL:0000127";
	public static String name = "astrocyte";
	public static String def = "\"A class of large neuroglial (macroglial) cells in the central nervous system - the largest and most numerous neuroglial cells in the brain and spinal cord. Astrocytes (from 'star' cells) are irregularly shaped with many long processes, including those with 'end feet' which form the glial (limiting) membrane and directly and indirectly contribute to the blood-brain barrier. They regulate the extracellular ionic and chemical environment, and 'reactive astrocytes' (along with microglia) respond to injury.\" [MESH:A.08.637.200]";
}


@Term
interface Oligodendrocyte extends MacroglialCell {
	public static String id = "CL:0000128";
	public static String name = "oligodendrocyte";
	public static String def = "\"A class of large neuroglial (macroglial) cells in the central nervous system. Form the insulating myelin sheath of axons in the central nervous system.\" [MESH:A.08.637.600]";

	@Relates("develops_from")
	public GlioblastSensuVertebrata Oligodendrocyte_develops_from();
}


@Term
interface MicroglialCell extends CentralNervousSystemMacrophage {
	public static String id = "CL:0000129";
	public static String name = "microglial cell";
	public static String def = "\"A central nervous system macrophage found in the parenchyma of the central nervous system.\" [GOC:add, ISBN:0721601464]";
}


@Term
interface NeuronAssociatedCellSensuNematodaAndProtostomia extends NeuronAssociatedCell {
	public static String id = "CL:0000130";
	public static String name = "neuron associated cell (sensu Nematoda and Protostomia)";
	public static String def = "";
}


@Term
interface GutEndothelialCell extends ColumnarCuboidalEpithelialCell, EndothelialCell {
	public static String id = "CL:0000131";
	public static String name = "gut endothelial cell";
	public static String def = "";

	@Relates("develops_from")
	public EndodermalCell GutEndothelialCell_develops_from();
}


@Term
interface CornealEndothelialCell extends SquamousEpithelialCell, EndothelialCell {
	public static String id = "CL:0000132";
	public static String name = "corneal endothelial cell";
	public static String def = "\"Cell of the single layer of large flattened cells covering the surface of the cornea.\" [MESH:A.09.371.060.067.31]";

	@Relates("develops_from")
	public CranialNeuralCrestCell CornealEndothelialCell_develops_from();
}


@Term
interface NeurectodermalCell extends EctodermalCell {
	public static String id = "CL:0000133";
	public static String name = "neurectodermal cell";
	public static String def = "";
}


@Term
interface MesenchymalCell extends CellByHistology {
	public static String id = "CL:0000134";
	public static String name = "mesenchymal cell";
	public static String def = "\"A cell that normally gives rise to other cells that are organized as three-dimensional masses, rather than sheets.\" [FB:ma]";

	@Relates("develops_from")
	public MesodermalCell MesenchymalCell_develops_from();
}


@Term
interface Fibrocyte extends StromalCell {
	public static String id = "CL:0000135";
	public static String name = "fibrocyte";
	public static String def = "";

	@Relates("develops_from")
	public FibroblastNeuralCrestDerived Fibrocyte_develops_from();

	@Relates("develops_from")
	public Fibroblast Fibrocyte_develops_from_1();
}


@Term
interface FatCell extends StuffAccumulatingCell {
	public static String id = "CL:0000136";
	public static String name = "fat cell";
	public static String def = "\"A fat-storing cell found mostly in the abdominal cavity and subcutaneous tissue of mammals. Fat is usually stored in the form of triglycerides.\" [MESH:A.11.329.114]";

	@Relates("develops_from")
	public Fibroblast FatCell_develops_from();

	@Relates("develops_from")
	public MesenchymalCell FatCell_develops_from_1();
}


@Term
interface Osteocyte extends BoneMatrixSecretingCell {
	public static String id = "CL:0000137";
	public static String name = "osteocyte";
	public static String def = "\"A mature osteoblast that has become embedded in the bone matrix. They occupy a small cavity, called lacuna, in the matrix and are connected to adjacent osteocytes via protoplasmic projections called canaliculi.\" [MESH:A.11.329.629.500]";

	@Relates("develops_from")
	public Osteoblast Osteocyte_develops_from();
}


@Term
interface Chondrocyte extends GAGSecretingCell, CollagenSecretingCell {
	public static String id = "CL:0000138";
	public static String name = "chondrocyte";
	public static String def = "\"Polymorphic cell that form cartilage.\" [MESH:A.11.329.171]";

	@Relates("develops_from")
	public Chondroblast Chondrocyte_develops_from();
}


@Term
interface Amelocyte extends EnamelSecretingCell, SimpleColumnarEpithelialCell {
	public static String id = "CL:0000139";
	public static String name = "amelocyte";
	public static String def = "";

	@Relates("develops_from")
	public Ameloblast Amelocyte_develops_from();
}


@Term
interface Odontocyte extends DentineSecretingCell {
	public static String id = "CL:0000140";
	public static String name = "odontocyte";
	public static String def = "";

	@Relates("develops_from")
	public Odontoblast Odontocyte_develops_from();

	@Relates("develops_from")
	public MesenchymalCell Odontocyte_develops_from_1();
}


@Term
interface Cementocyte extends Osteocyte {
	public static String id = "CL:0000141";
	public static String name = "cementocyte";
	public static String def = "\"An osteocytelike cell with numerous processes, trapped in a lacuna in the cement of the tooth.\" [ISBN:0781733901 \"Stedman's Medical Dictionary\"]";

	@Relates("develops_from")
	public Cementoblast Cementocyte_develops_from();
}


@Term
interface Hyalocyte extends StromalCell {
	public static String id = "CL:0000142";
	public static String name = "hyalocyte";
	public static String def = "";
}


@Term
interface GuidepostCell extends NeuronAssociatedCellSensuNematodaAndProtostomia {
	public static String id = "CL:0000143";
	public static String name = "guidepost cell";
	public static String def = "";
}


@Term
interface CellByFunction extends CellByClass {
	public static String id = "CL:0000144";
	public static String name = "cell by function";
	public static String def = "\"A classification of cells by their primary end goal or behavior.\" [FB:ma]";
}


@Term
interface ProfessionalAntigenPresentingCell extends DefensiveCell {
	public static String id = "CL:0000145";
	public static String name = "professional antigen presenting cell";
	public static String def = "\"A cell capable of processing and presenting lipid and protein antigens to T cells in order to initiate an immune response.\" [GOC:add, ISBN:0781735149]";
}


@Term
interface SimpleColumnarEpithelialCell extends ColumnarCuboidalEpithelialCell {
	public static String id = "CL:0000146";
	public static String name = "simple columnar epithelial cell";
	public static String def = "";
}


@Term
interface PigmentCell extends StuffAccumulatingCell {
	public static String id = "CL:0000147";
	public static String name = "pigment cell";
	public static String def = "";
}


@Term
interface Melanocyte extends PigmentCell {
	public static String id = "CL:0000148";
	public static String name = "melanocyte";
	public static String def = "\"A pigment cell derived from the neural crest. Contains melanin-filled pigment granules, which gives a brown to black appearance.\" [SANBI:mhl]";

	@Relates("develops_from")
	public Melanoblast Melanocyte_develops_from();
}


@Term
interface VisualPigmentCell extends PigmentCell {
	public static String id = "CL:0000149";
	public static String name = "visual pigment cell";
	public static String def = "";
}


@Term
interface GlandularEpithelialCell extends ColumnarCuboidalEpithelialCell {
	public static String id = "CL:0000150";
	public static String name = "glandular epithelial cell";
	public static String def = "";
}


@Term
interface SecretoryCell extends CellByFunction {
	public static String id = "CL:0000151";
	public static String name = "secretory cell";
	public static String def = "";
}


@Term
interface ExocrineCell extends SecretoryCell, AnimalCell {
	public static String id = "CL:0000152";
	public static String name = "exocrine cell";
	public static String def = "\"A cell of an exocrine gland, i.e. a gland that discharges its secretion via a duct.\" [ISBN:0198547684]";
}


@Term
interface GAGSecretingCell extends ExtracellularMatrixSecretingCell {
	public static String id = "CL:0000153";
	public static String name = "GAG secreting cell";
	public static String def = "";
}


@Term
interface ProteinSecretingCell extends SecretoryCell {
	public static String id = "CL:0000154";
	public static String name = "protein secreting cell";
	public static String def = "";
}


@Term
interface PepsinogenSecretingCell extends ProteinSecretingCell {
	public static String id = "CL:0000155";
	public static String name = "pepsinogen secreting cell";
	public static String def = "";
}


@Term
interface SurfactantSecretingCell extends SecretoryCell {
	public static String id = "CL:0000157";
	public static String name = "surfactant secreting cell";
	public static String def = "";
}


@Term
interface ClaraCell extends SurfactantSecretingCell, AnimalCell {
	public static String id = "CL:0000158";
	public static String name = "Clara cell";
	public static String def = "\"Epithelial progenitor cell of the lung. Clara cells are dome-shaped with short microvilli but no cilia. They function to protect the bronchiolar epithelium. Clara cells also multiply and differentiate into ciliated cells to regenerate the bronchiolar epithelium.\" [PMID:12107102, PMID:7905712]";
}


@Term
interface SeromucusSecretingCell extends SecretoryCell {
	public static String id = "CL:0000159";
	public static String name = "seromucus secreting cell";
	public static String def = "";
}


@Term
interface GobletCell extends MucusSecretingCell {
	public static String id = "CL:0000160";
	public static String name = "goblet cell";
	public static String def = "\"A cell of the epithelial lining that produce and secrete mucins.\" [MESH:A.03.492.411.369.320]";
}


@Term
interface AcidSecretingCell extends SecretoryCell {
	public static String id = "CL:0000161";
	public static String name = "acid secreting cell";
	public static String def = "";
}


@Term
interface ParietalCell extends AcidSecretingCell, AnimalCell {
	public static String id = "CL:0000162";
	public static String name = "parietal cell";
	public static String def = "";
}


@Term
interface EndocrineCell extends SecretoryCell, AnimalCell {
	public static String id = "CL:0000163";
	public static String name = "endocrine cell";
	public static String def = "\"A cell of an endocrine gland, ductless glands that secrete substances which are released directly into the circulation and which influence metabolism and other body functions.\" [MESH:A.06.407]";
}


@Term
interface EnteroendocrineCell extends EndocrineCell {
	public static String id = "CL:0000164";
	public static String name = "enteroendocrine cell";
	public static String def = "\"An endocrine cell that is located in the epithelium of the gastrointestinal tract.\" [SANBI:mhl]";
}


@Term
interface NeuroendocrineCell extends EndocrineCell, ElectricallyResponsiveCell {
	public static String id = "CL:0000165";
	public static String name = "neuroendocrine cell";
	public static String def = "\"A neuron that has the specialized function to produce and secrete hormones, and that constitutes, in whole or in part, an endocrine organ or system.\" [MESH:A.06.688]";
}


@Term
interface ChromaffinCell extends NeuroendocrineCell {
	public static String id = "CL:0000166";
	public static String name = "chromaffin cell";
	public static String def = "\"A cell that stores epinephrine secretory vesicles. During times of stress, the nervous system signals the vesicles to secrete their hormonal content. Their name derives from their ability to stain a brownish color with chromic salts. Characteristically, they are located in the adrenal medulla and paraganglia of the sympathetic nervous system.\" [MESH:A.06.224.161]";

	@Relates("develops_from")
	public NeuralCrestCell ChromaffinCell_develops_from();
}


@Term
interface PeptideHormoneSecretingCell extends EndocrineCell {
	public static String id = "CL:0000167";
	public static String name = "peptide hormone secreting cell";
	public static String def = "";
}


@Term
interface InsulinSecretingCell extends PeptideHormoneSecretingCell {
	public static String id = "CL:0000168";
	public static String name = "insulin secreting cell";
	public static String def = "";
}


@Term
interface PancreaticBCell extends InsulinSecretingCell {
	public static String id = "CL:0000169";
	public static String name = "pancreatic B cell";
	public static String def = "";
}


@Term
interface GlucagonSecretingCell extends PeptideHormoneSecretingCell {
	public static String id = "CL:0000170";
	public static String name = "glucagon secreting cell";
	public static String def = "";
}


@Term
interface PancreaticACell extends GlucagonSecretingCell {
	public static String id = "CL:0000171";
	public static String name = "pancreatic A cell";
	public static String def = "";
}


@Term
interface SomatostatinSecretingCell extends PeptideHormoneSecretingCell {
	public static String id = "CL:0000172";
	public static String name = "somatostatin secreting cell";
	public static String def = "";
}


@Term
interface PancreaticDCell extends DCell {
	public static String id = "CL:0000173";
	public static String name = "pancreatic D cell";
	public static String def = "";
}


@Term
interface SteroidHormoneSecretingCell extends EndocrineCell {
	public static String id = "CL:0000174";
	public static String name = "steroid hormone secreting cell";
	public static String def = "";
}


@Term
interface LutealCell extends SteroidHormoneSecretingCell {
	public static String id = "CL:0000175";
	public static String name = "luteal cell";
	public static String def = "\"A progesterone secreting cell in the corpus luteum. The large luteal cells develop from the granulosa cells. The small luteal cells develop from the theca cells.\" [MESH:A.05.360.319.114.630.278.400]";
}


@Term
interface EcdysteroidSecretingCell extends SteroidHormoneSecretingCell {
	public static String id = "CL:0000176";
	public static String name = "ecdysteroid secreting cell";
	public static String def = "";
}


@Term
interface TestosteroneSecretingCell extends SteroidHormoneSecretingCell {
	public static String id = "CL:0000177";
	public static String name = "testosterone secreting cell";
	public static String def = "";
}


@Term
interface LeydigCell extends TestosteroneSecretingCell {
	public static String id = "CL:0000178";
	public static String name = "Leydig cell";
	public static String def = "";
}


@Term
interface ProgesteroneSecretingCell extends SteroidHormoneSecretingCell {
	public static String id = "CL:0000179";
	public static String name = "progesterone secreting cell";
	public static String def = "";
}


@Term
interface EstradiolSecretingCell extends SteroidHormoneSecretingCell {
	public static String id = "CL:0000180";
	public static String name = "estradiol secreting cell";
	public static String def = "";
}


@Term
interface MetabolisingCell extends CellByFunction {
	public static String id = "CL:0000181";
	public static String name = "metabolising cell";
	public static String def = "\"A cell whose primary function is intermediary metabolism.\" [FB:ma]";
}


@Term
interface Hepatocyte extends EpithelialCell, MetabolisingCell, EndopolyploidCell, AnimalCell {
	public static String id = "CL:0000182";
	public static String name = "hepatocyte";
	public static String def = "\"The main structural component of the liver. They are specialized epithelial cells that are organized into interconnected plates called lobules.\" [MESH:A.11.436.348]";

	@Relates("develops_from")
	public MesenchymalCell Hepatocyte_develops_from();

	@Relates("develops_from")
	public EndodermalCell Hepatocyte_develops_from_1();
}


@Term
interface ContractileCell extends CellByFunction {
	public static String id = "CL:0000183";
	public static String name = "contractile cell";
	public static String def = "\"A cell whose primary function is to shorten.\" [FB:ma]";
}


@Term
interface Pericyte extends ContractileCell, AnimalCell {
	public static String id = "CL:0000184";
	public static String name = "pericyte";
	public static String def = "\"A slender, contractile, mesenchymal-like cell found in close association with capillary walls. They are relatively undifferentiated and may become fibroblasts, macrophages, or smooth muscle cells. (From Stedman, 26th ed).\" [MESH:A.07.231.330.600]";
}


@Term
interface MyoepithelialCell extends ColumnarCuboidalEpithelialCell, ContractileCell {
	public static String id = "CL:0000185";
	public static String name = "myoepithelial cell";
	public static String def = "";

	@Relates("develops_from")
	public MesodermalCell MyoepithelialCell_develops_from();
}


@Term
interface MyofibroblastCell extends ContractileCell, AnimalCell {
	public static String id = "CL:0000186";
	public static String name = "myofibroblast cell";
	public static String def = "";
}


@Term
interface MuscleCell extends ContractileCell, ElectricallyResponsiveCell {
	public static String id = "CL:0000187";
	public static String name = "muscle cell";
	public static String def = "\"A mature contractile cell, commonly known as a myocyte, that forms one of three kinds of muscle.\" [MESH:A.11.620]";

	@Relates("develops_from")
	public Myoblast MuscleCell_develops_from();
}


@Term
interface SkeletalMuscleCell extends MuscleCell, MultinucleateCell {
	public static String id = "CL:0000188";
	public static String name = "skeletal muscle cell";
	public static String def = "";

	@Relates("develops_from")
	public SkeletalMuscleMyoblast SkeletalMuscleCell_develops_from();
}


@Term
interface SlowMuscleCell extends SkeletalMuscleCell {
	public static String id = "CL:0000189";
	public static String name = "slow muscle cell";
	public static String def = "";

	@Relates("develops_from")
	public SlowMuscleMyoblast SlowMuscleCell_develops_from();
}


@Term
interface FastMuscleCell extends SkeletalMuscleCell {
	public static String id = "CL:0000190";
	public static String name = "fast muscle cell";
	public static String def = "";

	@Relates("develops_from")
	public FastMuscleMyoblast FastMuscleCell_develops_from();
}


@Term
interface SmoothMuscleCell extends MuscleCell {
	public static String id = "CL:0000192";
	public static String name = "smooth muscle cell";
	public static String def = "\"A non-striated, elongated, spindle-shaped cell found lining the digestive tract, uterus, and blood vessels. They develop from specialized myoblasts (smooth muscle myoblast).\" [MESH:A.11.620.520]";
}


@Term
interface CardiacMuscleCellSensuArthopoda extends MultinucleateCell, CardiacMuscleCell {
	public static String id = "CL:0000193";
	public static String name = "cardiac muscle cell (sensu Arthopoda)";
	public static String def = "\"A striated muscle cell found in the heart. They develop from cardiac myoblasts.\" [MESH:A.11.620.500]";

	@Relates("develops_from")
	public CardioblastSensuArthropoda CardiacMuscleCellSensuArthopoda_develops_from();
}


@Term
interface FlightMuscleCell extends MuscleCell, MultinucleateCell {
	public static String id = "CL:0000196";
	public static String name = "flight muscle cell";
	public static String def = "";
}


@Term
interface ReceptorCell extends AnimalCell {
	public static String id = "CL:0000197";
	public static String name = "receptor cell";
	public static String def = "";
}


@Term
interface PainReceptorCell extends ReceptorCellSensuAnimalia {
	public static String id = "CL:0000198";
	public static String name = "pain receptor cell";
	public static String def = "\"The peripheral receptor for pain. Includes receptors which are sensitive to painful mechanical stimuli, extreme heat or cold, and chemical stimuli. All mammalian nociceptors are free nerve endings.\" [MESH:A.08.800.550.700.650]";
}


@Term
interface MechanoreceptorCell extends ReceptorCellSensuAnimalia {
	public static String id = "CL:0000199";
	public static String name = "mechanoreceptor cell";
	public static String def = "\"A cell specialized to transduce mechanical stimuli and relay that information centrally in the nervous system.\" [MESH:A.08.800.550.700.500]";
}


@Term
interface TouchReceptorCell extends MechanoreceptorCell {
	public static String id = "CL:0000200";
	public static String name = "touch receptor cell";
	public static String def = "";
}


@Term
interface AuditoryReceptorCell extends ReceptorCellSensuAnimalia {
	public static String id = "CL:0000201";
	public static String name = "auditory receptor cell";
	public static String def = "";
}


@Term
interface AuditoryHairCell extends AuditoryReceptorCell, HairCell {
	public static String id = "CL:0000202";
	public static String name = "auditory hair cell";
	public static String def = "\"A mechanoreceptor cell located in the inner ear that is sensitive to auditory stimuli. The accessory sensory structures are arranged so that appropriate stimuli cause movement of the hair-like projections (stereocilia and kinocilia) which relay the information centrally in the nervous system.\" [MESH:A.08.663.650.250]";
}


@Term
interface GravitySensitiveCell extends ReceptorCellSensuAnimalia {
	public static String id = "CL:0000203";
	public static String name = "gravity sensitive cell";
	public static String def = "";
}


@Term
interface AccelerationReceptiveCell extends ReceptorCellSensuAnimalia {
	public static String id = "CL:0000204";
	public static String name = "acceleration receptive cell";
	public static String def = "";
}


@Term
interface ThermoreceptorCell extends ReceptorCellSensuAnimalia {
	public static String id = "CL:0000205";
	public static String name = "thermoreceptor cell";
	public static String def = "\"A cellular receptor which mediates the sense of temperature. Thermoreceptors in vertebrates are mostly located under the skin. In mammals there are separate types of thermoreceptors for cold and for warmth and pain receptor cells which detect cold or heat extreme enough to cause pain.\" [MESH:A.08.800.550.700.840]";
}


@Term
interface ChemoreceptorCell extends ReceptorCellSensuAnimalia {
	public static String id = "CL:0000206";
	public static String name = "chemoreceptor cell";
	public static String def = "\"A cell specialized to detect chemical substances and relay that information centrally in the nervous system. Chemoreceptors may monitor external stimuli, as in taste and olfaction, or internal stimuli, such as the concentrations of oxygen and carbon dioxide in the blood.\" [MESH:A.08.800.550.700.120]";
}


@Term
interface OlfactoryReceptorCell extends ChemoreceptorCell {
	public static String id = "CL:0000207";
	public static String name = "olfactory receptor cell";
	public static String def = "";
}


@Term
interface PHReceptorCell extends ChemoreceptorCell {
	public static String id = "CL:0000208";
	public static String name = "pH receptor cell";
	public static String def = "";
}


@Term
interface TasteReceptorCell extends ChemoreceptorCell {
	public static String id = "CL:0000209";
	public static String name = "taste receptor cell";
	public static String def = "";
}


@Term
interface PhotoreceptorCell extends ReceptorCellSensuAnimalia {
	public static String id = "CL:0000210";
	public static String name = "photoreceptor cell";
	public static String def = "\"A cell specialized to detect and transduce light.\" [MESH:A.08.663.650.650]";
}


@Term
interface ElectricallyActiveCell extends CellByFunction, AnimalCell {
	public static String id = "CL:0000211";
	public static String name = "electrically active cell";
	public static String def = "\"A cell whose function is determined by the generation or the reception of an electric signal.\" [FB:ma]";
}


@Term
interface AbsorptiveCell extends CellByFunction, AnimalCell {
	public static String id = "CL:0000212";
	public static String name = "absorptive cell";
	public static String def = "\"A cell that takes up and metabolizes substances.\" [CL:CVS]";
}


@Term
interface LiningCell extends BarrierCell {
	public static String id = "CL:0000213";
	public static String name = "lining cell";
	public static String def = "\"A cell within an epithelial cell sheet whose main function is to act as an internal or external covering for a tissue or an organism.\" [JB:jb]";
}


@Term
interface SynovialCell extends GAGSecretingCell, LiningCell {
	public static String id = "CL:0000214";
	public static String name = "synovial cell";
	public static String def = "";

	@Relates("develops_from")
	public MesenchymalCell SynovialCell_develops_from();
}


@Term
interface BarrierCell extends CellByFunction, AnimalCell {
	public static String id = "CL:0000215";
	public static String name = "barrier cell";
	public static String def = "\"A cell whose primary function is to prevent the transport of stuff across compartments.\" [JB:jb]";
}


@Term
interface SertoliCell extends BarrierCell, AndrogenBindingProteinSecretingCell {
	public static String id = "CL:0000216";
	public static String name = "Sertoli cell";
	public static String def = "\"A supporting cell projecting inward from the basement membrane of seminiferous tubules. They surround and nourish the developing male germ cells and secrete androgen binding protein. Their tight junctions with the spermatogonia and spermatocytes provide a blood-testis barrier.\" [MESH:A.05.360.444.849.789]";
}


@Term
interface InsulatingCell extends BarrierCell {
	public static String id = "CL:0000217";
	public static String name = "insulating cell";
	public static String def = "";
}


@Term
interface SchwannCell extends InsulatingCell, GlialCellSensuVertebrata, MyelinAccumulatingCell {
	public static String id = "CL:0000218";
	public static String name = "Schwann cell";
	public static String def = "\"A neuroglial cell of the peripheral nervous system which forms the insulating myelin sheaths of peripheral axons.\" [MESH:A.08.637.800]";
}


@Term
interface MotileCell extends CellByFunction, AnimalCell {
	public static String id = "CL:0000219";
	public static String name = "motile cell";
	public static String def = "\"A cell that moves by its own activities.\" [FB:ma]";
}


@Term
interface CellByLineage extends CellByClass {
	public static String id = "CL:0000220";
	public static String name = "cell by lineage";
	public static String def = "";
}


@Term
interface EctodermalCell extends CellByLineage, AnimalCell {
	public static String id = "CL:0000221";
	public static String name = "ectodermal cell";
	public static String def = "\"A cell of the outer of the three germ layers of the embryo.\" [MESH:A.16.254.425.273]";
}


@Term
interface MesodermalCell extends CellByLineage, AnimalCell {
	public static String id = "CL:0000222";
	public static String name = "mesodermal cell";
	public static String def = "\"A cell of the middle germ layer of the embryo.\" [MESH:A.16.254.425.660]";
}


@Term
interface EndodermalCell extends CellByLineage, AnimalCell {
	public static String id = "CL:0000223";
	public static String name = "endodermal cell";
	public static String def = "\"A cell of the inner of the three germ layers of the embryo.\" [MESH:A.16.254.425.407]";
}


@Term
interface CellByNuclearNumber extends CellByClass {
	public static String id = "CL:0000224";
	public static String name = "cell by nuclear number";
	public static String def = "\"A classification of cells by the number of their nuclei.\" [FB:ma]";
}


@Term
interface AnucleateCell extends CellByNuclearNumber {
	public static String id = "CL:0000225";
	public static String name = "anucleate cell";
	public static String def = "\"A cell that lacks a nucleus.\" [FB:ma]";
}


@Term
interface SingleNucleateCell extends CellByNuclearNumber {
	public static String id = "CL:0000226";
	public static String name = "single nucleate cell";
	public static String def = "\"A cell with a single nucleus.\" [FB:ma]";
}


@Term
interface BinucleateCell extends MultinucleateCell {
	public static String id = "CL:0000227";
	public static String name = "binucleate cell";
	public static String def = "";
}


@Term
interface MultinucleateCell extends CellByNuclearNumber {
	public static String id = "CL:0000228";
	public static String name = "multinucleate cell";
	public static String def = "\"A cell with more than one nucleus.\" [FB:ma]";
}


@Term
interface Erythrocyte extends BloodCell, OxygenAccumulatingCell, ErythroidLineageCell {
	public static String id = "CL:0000232";
	public static String name = "erythrocyte";
	public static String def = "\"A red blood cell. In mammals, mature erythrocytes are non-nucleated, biconcave disks containing hemoglobin whose function is to transport oxygen.\" [MESH:A.11.118.290]";

	@Relates("develops_from")
	public Reticulocyte Erythrocyte_develops_from();
}


@Term
interface Platelet extends BloodCell, AnucleateCell, MyeloidCell {
	public static String id = "CL:0000233";
	public static String name = "platelet";
	public static String def = "\"A non-nucleated disk-shaped cell formed by extrusion from megakaryocytes, found in the blood of all mammals, and mainly involved in blood coagulation.\" [GOC:add, MESH:A.11.118.188]";

	@Relates("develops_from")
	public Megakaryocyte Platelet_develops_from();
}


@Term
interface Phagocyte extends MotileCell, StuffAccumulatingCell, DefensiveCell {
	public static String id = "CL:0000234";
	public static String name = "phagocyte";
	public static String def = "\"Any cell capable of ingesting particulate matter via phagocytosis.\" [GOC:add, ISBN:0721601464]";
}


@Term
interface Macrophage extends MyeloidLeukocyte {
	public static String id = "CL:0000235";
	public static String name = "macrophage";
	public static String def = "\"A mononuclear phagocyte present in variety of tissues, typically differentiated from monocytes, capable of phagocytosing a variety of extracellular particulate material, including immune complexes, microorganisms, and dead cells.\" [GO_REF:0000031, GOC:add, http://www.clt.astate.edu/wwilliam/]";

	@Relates("develops_from")
	public Monocyte Macrophage_develops_from();
}


@Term
interface BCell extends LymphocyteOfBLineage {
	public static String id = "CL:0000236";
	public static String name = "B cell";
	public static String def = "\"A lymphocyte of B lineage with the phenotype CD19-positive and surface immunoglobulin-positive.\" [GO_REF:0000031, GOC:add, ISBN:0781735149]";

	@Relates("develops_from")
	public ProBCell BCell_develops_from();
}


@Term
interface KeratinizingBarrierEpithelialCell extends StratifiedSquamousEpithelialCell, KeratinAccumulatingCell {
	public static String id = "CL:0000237";
	public static String name = "keratinizing barrier epithelial cell";
	public static String def = "";

	@Relates("develops_from")
	public SurfaceEctodermalCell KeratinizingBarrierEpithelialCell_develops_from();
}


@Term
interface NonKeratinizingBarrierEpithelialCell extends StratifiedSquamousEpithelialCell {
	public static String id = "CL:0000238";
	public static String name = "non keratinizing barrier epithelial cell";
	public static String def = "";
}


@Term
interface BrushBorderEpithelialCell extends ColumnarCuboidalEpithelialCell {
	public static String id = "CL:0000239";
	public static String name = "brush border epithelial cell";
	public static String def = "";
}


@Term
interface StratifiedSquamousEpithelialCell extends StratifiedEpithelialCell {
	public static String id = "CL:0000240";
	public static String name = "stratified squamous epithelial cell";
	public static String def = "";
}


@Term
interface StratifiedCuboidalEpithelialCell extends StratifiedEpithelialCell {
	public static String id = "CL:0000241";
	public static String name = "stratified cuboidal epithelial cell";
	public static String def = "";
}


@Term
interface MerkelCell extends NeuronAssociatedCellSensuVertebrata {
	public static String id = "CL:0000242";
	public static String name = "Merkel cell";
	public static String def = "\"A modified epidermal cell located in the stratum basale. They are found mostly in areas where sensory perception is acute. Merkel cells are closely associated with an expanded terminal bulb of an afferent myelinated nerve fiber.\" [MESH:A.08.800.550.700.500.425]";
}


@Term
interface GlialCellSensuVertebrata extends GlialCell {
	public static String id = "CL:0000243";
	public static String name = "glial cell (sensu Vertebrata)";
	public static String def = "\"A non-neuronal cell of the nervous system. They not only provide physical support, but also respond to injury, regulate the ionic and chemical composition of the extracellular milieu. Form the myelin insulation of nervous pathways, guide neuronal migration during development, and exchange metabolites with neurons. Neuroglia have high-affinity transmitter uptake systems, voltage-dependent and transmitter-gated ion channels, and can release transmitters, but their role in signaling (as in many other functions) is unclear.\" [MESH:A.08.637]";

	@Relates("develops_from")
	public GlioblastSensuVertebrata GlialCellSensuVertebrata_develops_from();
}


@Term
interface TransitionalEpithelialCell extends EpithelialCell {
	public static String id = "CL:0000244";
	public static String name = "transitional epithelial cell";
	public static String def = "";
}


@Term
interface PassageCell extends StructuralCell, PlantCell {
	public static String id = "CL:0000245";
	public static String name = "passage cell";
	public static String def = "\"Cell in exodermis or endodermis that remains thin walled when the associated cells develop thick secondary walls. Has casparian strip in endodermis.\" [ISBN:0471245208]";
}


@Term
interface MauthnerNeuron extends Interneuron {
	public static String id = "CL:0000246";
	public static String name = "Mauthner neuron";
	public static String def = "";
}


@Term
interface RohonBeardNeuron extends PrimarySensoryNeuron {
	public static String id = "CL:0000247";
	public static String name = "Rohon-Beard neuron";
	public static String def = "";
}


@Term
interface Microsporocyte extends GermLineCell, PlantCell {
	public static String id = "CL:0000248";
	public static String name = "microsporocyte";
	public static String def = "\"A diploid (2n) cell that undergoes meiosis and forms four haploid (1n) microspores; also called microspore mother cell and, in seed plants, pollen mother cell.\" [ISBN:0471245208]";
}


@Term
interface HatchingGlandCell extends SecretoryCell {
	public static String id = "CL:0000249";
	public static String name = "hatching gland cell";
	public static String def = "";
}


@Term
interface Megaspore extends FemaleGermCell {
	public static String id = "CL:0000250";
	public static String name = "megaspore";
	public static String def = "\"A haploid (1n) spore developing into a female gametophyte in heterosporous plants.\" [ISBN:0471245208]";

	@Relates("develops_from")
	public Megasporocyte Megaspore_develops_from();
}


@Term
interface ExtramedullaryCell extends SensoryNeuron {
	public static String id = "CL:0000251";
	public static String name = "extramedullary cell";
	public static String def = "";
}


@Term
interface Microspore extends MaleGermCell {
	public static String id = "CL:0000252";
	public static String name = "microspore";
	public static String def = "\"A haploid (1n) spore developing into a male gametophyte in heterosporous plants; the uninucleate pollen grain in seed plants.\" [ISBN:0471245208]";

	@Relates("develops_from")
	public Microsporocyte Microspore_develops_from();
}


@Term
interface EurydendroidCell extends EfferentNeuron {
	public static String id = "CL:0000253";
	public static String name = "eurydendroid cell";
	public static String def = "";
}


@Term
interface EggCell extends PlantCell, FemaleGamete {
	public static String id = "CL:0000254";
	public static String name = "egg cell";
	public static String def = "\"The female gamete of plants.\" [TAIR:lr]";
}


@Term
interface EukaryoticCell extends CellByOrganism {
	public static String id = "CL:0000255";
	public static String name = "eukaryotic cell";
	public static String def = "";
}


@Term
interface UricAcidAccumulatingCell extends StuffAccumulatingCell {
	public static String id = "CL:0000256";
	public static String name = "uric acid accumulating cell";
	public static String def = "";
}


@Term
interface MycetozoanCell extends EukaryoticCell {
	public static String id = "CL:0000257";
	public static String name = "Mycetozoan cell";
	public static String def = "";
}


@Term
interface FiberTracheid extends TrachearyElement {
	public static String id = "CL:0000258";
	public static String name = "fiber tracheid";
	public static String def = "\"A fiber like tracheid in the secondary xylem; commonly thick walled, with pointed ends and bordered pits that have lenticular to slit like apertures.\" [ISBN:0471245208]";
}


@Term
interface AggregateCell extends VegetativeCellSensuMycetozoa {
	public static String id = "CL:0000259";
	public static String name = "aggregate cell";
	public static String def = "\"Differentiating cell composing the aggregate that has acquired adhesive properties.\" [DictyBase:DDB]";
}


@Term
interface MucilageCell extends SecretoryCell, PlantCell {
	public static String id = "CL:0000260";
	public static String name = "mucilage cell";
	public static String def = "\"Cell containing mucilages or gums or similar carbohydrate material characterized by the property of swelling in water.\" [ISBN:0471245208]";
}


@Term
interface AnteriorCell extends VegetativeCellSensuMycetozoa {
	public static String id = "CL:0000261";
	public static String name = "anterior cell";
	public static String def = "";
}


@Term
interface GuardMotherCell extends EpidermalCell, PlantCell {
	public static String id = "CL:0000262";
	public static String name = "guard mother cell";
	public static String def = "\"An epidermal cell that divides to produce the guard cells.\" [ISBN:0471245208]";

	@Relates("develops_from")
	public EpidermalInitial GuardMotherCell_develops_from();
}


@Term
interface VegetativeCellSensuMycetozoa extends MycetozoanCell {
	public static String id = "CL:0000263";
	public static String name = "vegetative cell (sensu Mycetozoa)";
	public static String def = "\"Unicellular haploid myxamoebae that feeds on bacteria and divides by binary fission.\" [DictyBase:DDB]";
}


@Term
interface PhloemInitial extends NonTerminallyDifferentiatedCell, CambialInitial {
	public static String id = "CL:0000264";
	public static String name = "phloem initial";
	public static String def = "\"A cambial cell on the phloem side of the cambial zone that is the source of one or more cells arising by periclinal divisions and differentiating into phloem elements with or without additional divisions in various planes.\" [ISBN:0471245208]";
}


@Term
interface AnteriorLikeCell extends VegetativeCellSensuMycetozoa {
	public static String id = "CL:0000265";
	public static String name = "anterior like cell";
	public static String def = "\"Cell that has properties of anterior cells (for e.g., accumulate vital dyes in autophagic vesicles) but that is are scattered throughout the rear of the slug. Some but not all these cells express the ecmA gene and/or the ecmB gene. ALCs maintain an amoeboid appearance during culmination. ALCs that express the ecmO promoter have been called pstO/ALC.\" [DictyBase:DDB]";
}


@Term
interface Meristemoid extends PlantCell, SomaticStemCell {
	public static String id = "CL:0000266";
	public static String name = "meristemoid";
	public static String def = "\"A cell constituting an active locus of meristematic activity in a tissue composed of somewhat older, differentiating cells.\" [ISBN:0471245208]";
}


@Term
interface PresporeCell extends VegetativeCellSensuMycetozoa {
	public static String id = "CL:0000267";
	public static String name = "prespore cell";
	public static String def = "\"Cell that is undergoing differentiation to become a spore.\" [DictyBase:DDB]";
}


@Term
interface SieveElement extends PlantCell, TransportingCell {
	public static String id = "CL:0000268";
	public static String name = "sieve element";
	public static String def = "\"The cell in the phloem tissue concerned with mainly longitudinal conduction of food materials. Classified into sieve cell and sieve tube member.\" [ISBN:0471245208]";
}


@Term
interface PrestalkCell extends VegetativeCellSensuMycetozoa {
	public static String id = "CL:0000269";
	public static String name = "prestalk cell";
	public static String def = "";
}


@Term
interface SubsidiaryCell extends StructuralCell, PlantCell {
	public static String id = "CL:0000270";
	public static String name = "subsidiary cell";
	public static String def = "\"An epidermal cell associated with a stoma and at least morphologically distinguishable from the epidermal cells composing the groundmass of the tissue.\" [ISBN:047124520]";
}


@Term
interface PrestalkACell extends PrestalkCell {
	public static String id = "CL:0000271";
	public static String name = "prestalk A cell";
	public static String def = "\"Cell expressing the ecmA marker from a promoter region that is proximal to the ATG (ecmAO promoter). They are located at the anterior-most region of the slug. During culmination pstA cells differentiate into pstAB cells.\" [DictyBase:DDB]";
}


@Term
interface CambialInitial extends NonTerminallyDifferentiatedCell, MeristematicCell {
	public static String id = "CL:0000272";
	public static String name = "cambial initial";
	public static String def = "\"A cell localized in the vascular cambium or phellogen. Its periclinal division can contribute cells either to the outside or to the inside of the axis; in vascular cambium, classified into fusiform initials (source of axial cells of xylem and phloem) and ray initials (source of the ray cells).\" [ISBN:0471245208]";
}


@Term
interface PrestalkABCell extends PrestalkCell {
	public static String id = "CL:0000273";
	public static String name = "prestalk AB cell";
	public static String def = "\"Cell that expresses both ecmA and ecmB either simultaneously or sequentially. During culmination pstA differentiate into pstAB cells.\" [DictyBase:DDB]";
}


@Term
interface PrestalkBCell extends PrestalkCell {
	public static String id = "CL:0000275";
	public static String name = "prestalk B cell";
	public static String def = "\"Cell expressing ecmB but not ecmA. Most pstB cells are located at the very rear of the slug (rearguard region). These cells form part of the basal disc of the fruiting body. If a migratory slug is formed, these cells are left behind.\" [DictyBase:DDB]";
}


@Term
interface SclerenchymaCell extends StructuralCell, PlantCell {
	public static String id = "CL:0000276";
	public static String name = "sclerenchyma cell";
	public static String def = "\"Cell variable in form and size, being more or less thick, often lignified, secondary walls. Belongs to the category of subcells and may or may not be devoid of protoplast at maturity.\" [ISBN:0471245208]";
}


@Term
interface PrestalkICell extends PrestalkCell {
	public static String id = "CL:0000277";
	public static String name = "prestalk I cell";
	public static String def = "\"Initial population of prestalk cells that activate the ecmA promoter at the mound stage and that presumably further differentiate into pstA and pstO cells.\" [DictyBase:DDB]";
}


@Term
interface CentralCell extends FemaleGermCell, PlantCell {
	public static String id = "CL:0000278";
	public static String name = "central cell";
	public static String def = "\"A cell containing the two polar nuclei which, after double fertilization, will develop into the endosperm.\" [TAIR:lr]";
}


@Term
interface Prestalk0Cell extends PrestalkCell {
	public static String id = "CL:0000279";
	public static String name = "prestalk 0 cell";
	public static String def = "\"Cell that express ecmA at a very low level. Located at the posterior half of the prestalk zone. Expresses ecmA from the distal region of its promoter (ecmO).\" [DictyBase:DDB]";
}


@Term
interface GenerativeCell extends GermLineCell, PlantCell {
	public static String id = "CL:0000280";
	public static String name = "generative cell";
	public static String def = "\"The cell that will give rise to the generative nuclei which will participate in fertilization.\" [TAIR:lr]";
}


@Term
interface PstABALC extends AnteriorLikeCell {
	public static String id = "CL:0000281";
	public static String name = "pstAB/ALC";
	public static String def = "\"Anterior-like cell expressing both ecmA and ecmB.\" [DictyBase:DDB]";
}


@Term
interface Trichome extends EpidermalCell {
	public static String id = "CL:0000282";
	public static String name = "trichome";
	public static String def = "\"An outgrowth from the epidermis. Trichomes vary in size and complexity and include hairs, scales, and other structures and may be glandular. In Arabidopsis, patterning of trichome development is not random but does not appear to be lineage-based like stomata.\" [ISBN:0471245208, PMID:10938806]";

	@Relates("develops_from")
	public EpidermalInitial Trichome_develops_from();
}


@Term
interface PstOALC extends AnteriorLikeCell {
	public static String id = "CL:0000283";
	public static String name = "pstO/ALC";
	public static String def = "\"Anterior-like cell that expresses the ecmO promoter and that can move to the position normally occupied by the pstO cells.\" [DictyBase:DDB]";
}


@Term
interface CompanionCell extends SupportiveCell, ParenchymalCell {
	public static String id = "CL:0000284";
	public static String name = "companion cell";
	public static String def = "\"A specialized parenchyma cell associated with a sieve-tube member in angiosperm phloem and arising from the same mother cell as the sieve-tube member.\" [ISBN:0879015322]";
}


@Term
interface StalkCell extends VegetativeCellSensuMycetozoa {
	public static String id = "CL:0000285";
	public static String name = "stalk cell";
	public static String def = "\"Vacuolated cell located at the center of the stalk tube that has a cell wall composed of cellulose and that die upon terminal differentiation. Stalk cells provide structural support for the fruiting body.\" [DictyBase:DDB]";
}


@Term
interface HyphalCell extends FungalCell {
	public static String id = "CL:0000286";
	public static String name = "hyphal cell";
	public static String def = "\"A cell of a filament of a fungal mycelium.\" [ISBN:08199377X]";
}


@Term
interface EyePhotoreceptorCell extends PhotoreceptorCell {
	public static String id = "CL:0000287";
	public static String name = "eye photoreceptor cell";
	public static String def = "";
}


@Term
interface Synergid extends PlantCell, SupportiveCell {
	public static String id = "CL:0000288";
	public static String name = "synergid";
	public static String def = "\"A cell in the micropylar end of the embryo sac associated with the egg in the egg apparatus of angiosperms. Plays a vital role in fertilization.\" [ISBN:047125208]";
}


@Term
interface ChemotacticAmoeboidCellSensuMycetozoa extends VegetativeCellSensuMycetozoa, AmoeboidCell {
	public static String id = "CL:0000289";
	public static String name = "chemotactic amoeboid cell (sensu Mycetozoa)";
	public static String def = "\"Starved cell that secretes and responds to chemoattractants (cAMP).\" [DictyBase:DDB]";
}


@Term
interface XylemFiberCell extends StructuralCell, XylemElement {
	public static String id = "CL:0000290";
	public static String name = "xylem fiber cell";
	public static String def = "\"A fiber of the xylem tissue, Two types are recognized in the secondary xylem: fiber tracheids and libriform fibers.\" [ISBN:0471245208]";
}


@Term
interface SporeSensuMycetozoa extends VegetativeCellSensuMycetozoa {
	public static String id = "CL:0000291";
	public static String name = "spore (sensu Mycetozoa)";
	public static String def = "\"Dormant cell protected by a spore coat.\" [DictyBase:DDB]";
}


@Term
interface GuardCell extends EpidermalCell, PlantCell {
	public static String id = "CL:0000292";
	public static String name = "guard cell";
	public static String def = "\"One of a pair of cells flanking the stomatal pore and causing the opening and closing of the pore by changes in turgor.\" [ISBN:0471245208]";

	@Relates("develops_from")
	public GuardMotherCell GuardCell_develops_from();
}


@Term
interface StructuralCell extends CellByFunction {
	public static String id = "CL:0000293";
	public static String name = "structural cell";
	public static String def = "\"A cell whose primary function is to provide structural support, to provide strength and physical integrity to the organism.\" [TAIR:sr]";
}


@Term
interface SieveCell extends SieveElement {
	public static String id = "CL:0000294";
	public static String name = "sieve cell";
	public static String def = "\"A type of sieve element that has relatively undifferentiated sieve areas (with narrow pores), rather uniform in structure on all walls; that is, there are no sieve plates. Typical of gymnosperms and lower vascular plants.\" [ISBN:0471245208]";
}


@Term
interface SomatotropinSecretingCell extends PeptideHormoneSecretingCell, AcidophilCell {
	public static String id = "CL:0000295";
	public static String name = "somatotropin secreting cell";
	public static String def = "\"An acidophilic cell of the anterior pituitary that produces growth hormone, somatotropin.\" [SANBI:mhl]";
}


@Term
interface VegetativeCell extends PlantCell {
	public static String id = "CL:0000296";
	public static String name = "vegetative cell";
	public static String def = "\"Cell type formed after the first mitotic division of the microgametophye, The nucleus of this cell migrates to the tip of the pollen tube after germination and disintegrates when the pollen tube penetrates the nucellus.\" [ISBN:0140514031, TAIR:lr]";
}


@Term
interface SocketCell extends EpidermalCell, SupportiveCell {
	public static String id = "CL:0000297";
	public static String name = "socket cell";
	public static String def = "\"A cell that surrounds a trichome and provides support for the trichome.\" [PMID:10938806]";

	@Relates("develops_from")
	public EpidermalInitial SocketCell_develops_from();
}


@Term
interface XylemElement extends AxialCell, TransportingCell {
	public static String id = "CL:0000298";
	public static String name = "xylem element";
	public static String def = "\"A cell composing the xylem.\" [ISBN:0471245208]";
}


@Term
interface Trichoblast extends EpidermalInitial {
	public static String id = "CL:0000299";
	public static String name = "trichoblast";
	public static String def = "\"Commonly used for a cell in root epidermis that gives rise to a root hair. The daughter cell produced by the asymmetric division of a root epidermal cell that gives rise to a root hair.\" [ISBN:0471245208]";
}


@Term
interface Gamete extends GermLineCell, HaploidCell {
	public static String id = "CL:0000300";
	public static String name = "gamete";
	public static String def = "";
}


@Term
interface PoleCell extends AnimalCell, PrimordialGermCell {
	public static String id = "CL:0000301";
	public static String name = "pole cell";
	public static String def = "";
}


@Term
interface CrystallinAccumulatingCell extends StuffAccumulatingCell, AnimalCell {
	public static String id = "CL:0000306";
	public static String name = "crystallin accumulating cell";
	public static String def = "";
}


@Term
interface TrachealEpithelialCell extends EpithelialCell {
	public static String id = "CL:0000307";
	public static String name = "tracheal epithelial cell";
	public static String def = "";

	@Relates("develops_from")
	public Tracheoblast TrachealEpithelialCell_develops_from();
}


@Term
interface MetalIonAccumulatingCell extends StuffAccumulatingCell, AnimalCell {
	public static String id = "CL:0000308";
	public static String name = "metal ion accumulating cell";
	public static String def = "";
}


@Term
interface CopperAccumulatingCell extends MetalIonAccumulatingCell {
	public static String id = "CL:0000309";
	public static String name = "copper accumulating cell";
	public static String def = "";
}


@Term
interface IronAccumulatingCell extends MetalIonAccumulatingCell {
	public static String id = "CL:0000310";
	public static String name = "iron accumulating cell";
	public static String def = "";
}


@Term
interface KeratinAccumulatingCell extends StuffAccumulatingCell, AnimalCell {
	public static String id = "CL:0000311";
	public static String name = "keratin accumulating cell";
	public static String def = "";
}


@Term
interface Keratinocyte extends KeratinAccumulatingCell {
	public static String id = "CL:0000312";
	public static String name = "keratinocyte";
	public static String def = "\"An epidermal cell which synthesizes keratin and undergoes a characteristic change as it moves upward from the basal layers of the epidermis to the cornified (horny) layer of the skin. Successive stages of differentiation of the keratinocytes forming the epidermal layers are basal cell, spinous or prickle cell, and the granular cell.\" [MESH:A.11.436.397]";
}


@Term
interface SerousSecretingCell extends SeromucusSecretingCell {
	public static String id = "CL:0000313";
	public static String name = "serous secreting cell";
	public static String def = "";
}


@Term
interface MilkSecretingCell extends SecretoryCell {
	public static String id = "CL:0000314";
	public static String name = "milk secreting cell";
	public static String def = "";
}


@Term
interface TearsSecretingCell extends SecretoryCell {
	public static String id = "CL:0000315";
	public static String name = "tears secreting cell";
	public static String def = "\"A cell secreting tears, the fluid secreted by the lacrimal glands. This fluid moistens the conjunctiva and cornea.\" [MESH:A.12.200.882]";
}


@Term
interface RayInitial extends CambialInitial {
	public static String id = "CL:0000316";
	public static String name = "ray initial";
	public static String def = "\"A meristemic ray cell in the vascular cambium that gives rise to ray cells of the secondary xylem and secondary phloem.\" [ISBN:0471245208]";
}


@Term
interface SebumSecretingCell extends SecretoryCell {
	public static String id = "CL:0000317";
	public static String name = "sebum secreting cell";
	public static String def = "\"A cell secreting sebun, an oily substance secreted by sebaceous glands, composed of keratin, fat, and cellular debris.\" [MESH:A.12.200.702]";
}


@Term
interface SweatSecretingCell extends SecretoryCell {
	public static String id = "CL:0000318";
	public static String name = "sweat secreting cell";
	public static String def = "\"A cell secreting sweat, the fluid excreted by the sweat glands of mammals. It consists of water containing sodium chloride, phosphate, urea, ammonia, and other waste products.\" [MESH:A.12.200.849]";
}


@Term
interface MucusSecretingCell extends SeromucusSecretingCell {
	public static String id = "CL:0000319";
	public static String name = "mucus secreting cell";
	public static String def = "";
}


@Term
interface Megasporocyte extends GermLineCell, PlantCell {
	public static String id = "CL:0000320";
	public static String name = "megasporocyte";
	public static String def = "\"A diploid (2n) cell that undergoes meiosis and produces four haploid (1n) megaspores; also called megaspore mother cell.\" [ISBN:0471245208]";
}


@Term
interface SeminalFluidSecretingCell extends SecretoryCell {
	public static String id = "CL:0000321";
	public static String name = "seminal fluid secreting cell";
	public static String def = "";
}


@Term
interface Pneumocyte extends SurfactantSecretingCell, AnimalCell {
	public static String id = "CL:0000322";
	public static String name = "pneumocyte";
	public static String def = "";
}


@Term
interface LysozymeSecretingCell extends ProteinSecretingCell {
	public static String id = "CL:0000323";
	public static String name = "lysozyme secreting cell";
	public static String def = "";
}


@Term
interface MetanephricMesenchymeStemCell extends MultiFateStemCell, AnimalCell {
	public static String id = "CL:0000324";
	public static String name = "metanephric mesenchyme stem cell";
	public static String def = "";

	@Relates("develops_from")
	public MesodermalCell MetanephricMesenchymeStemCell_develops_from();
}


@Term
interface StuffAccumulatingCell extends CellByFunction {
	public static String id = "CL:0000325";
	public static String name = "stuff accumulating cell";
	public static String def = "\"A cell that is specialised to accumulate a particular substance(s).\" [FB:ma]";
}


@Term
interface GlycogenAccumulatingCell extends StuffAccumulatingCell, AnimalCell {
	public static String id = "CL:0000326";
	public static String name = "glycogen accumulating cell";
	public static String def = "";
}


@Term
interface ExtracellularMatrixSecretingCell extends SecretoryCell, StromalCell {
	public static String id = "CL:0000327";
	public static String name = "extracellular matrix secreting cell";
	public static String def = "";
}


@Term
interface MyelinAccumulatingCell extends StuffAccumulatingCell, AnimalCell {
	public static String id = "CL:0000328";
	public static String name = "myelin accumulating cell";
	public static String def = "";
}


@Term
interface OxygenAccumulatingCell extends StuffAccumulatingCell, AnimalCell {
	public static String id = "CL:0000329";
	public static String name = "oxygen accumulating cell";
	public static String def = "";
}


@Term
interface CollenchymalCell extends CellByHistology, PlantCell {
	public static String id = "CL:0000330";
	public static String name = "collenchymal cell";
	public static String def = "\"An elongated living cell with unevenly thickened nonlignified primary walls.\" [ISBN:0471245208]";
}


@Term
interface Tracheid extends TrachearyElement {
	public static String id = "CL:0000331";
	public static String name = "tracheid";
	public static String def = "\"A tracheary element of the xylem that has no perforations, as contrasted with a vessel member. May occur in primary and in secondary xylem. May have any kind of secondary wall thickening found in tracheary elements.\" [ISBN:0471245208]";
}


@Term
interface Atrichoblast extends NonTerminallyDifferentiatedCell, EpidermalInitial {
	public static String id = "CL:0000332";
	public static String name = "atrichoblast";
	public static String def = "\"A cell formed after asymmetric division of root epidermal cell that does not give rise to a root hair.\" [ISBN:0387987819]";
}


@Term
interface NeuralCrestCell extends MotileCell {
	public static String id = "CL:0000333";
	public static String name = "neural crest cell";
	public static String def = "\"A cell of the strip of specialized ectoderm flanking each side of the embryonal neural plate, which after the closure of the neural tube, forms a column of isolated cells along the dorsal aspect of the neural tube. Most of the cranial and all of the spinal sensory ganglion cells arise by differentiation of neural crest cells.\" [MESH:A.16.254.600]";

	@Relates("develops_from")
	public NeurectodermalCell NeuralCrestCell_develops_from();
}


@Term
interface VegetativeCellSensuFungi extends FungalCell {
	public static String id = "CL:0000334";
	public static String name = "vegetative cell (sensu Fungi)";
	public static String def = "";
}


@Term
interface MesenchymeCondensationCell {
	public static String id = "CL:0000335";
	public static String name = "mesenchyme condensation cell";
	public static String def = "";

	@Relates("develops_from")
	public MesenchymalCell MesenchymeCondensationCell_develops_from();
}


@Term
interface AdrenalMedullaCell {
	public static String id = "CL:0000336";
	public static String name = "adrenal medulla cell";
	public static String def = "";

	@Relates("develops_from")
	public TrunkNeuralCrestCell AdrenalMedullaCell_develops_from();
}


@Term
interface NeuroblastSensuVertebrata extends Neuroblast {
	public static String id = "CL:0000337";
	public static String name = "neuroblast (sensu Vertebrata)";
	public static String def = "";
}


@Term
interface NeuroblastSensuNematodaAndProtostomia extends Neuroblast {
	public static String id = "CL:0000338";
	public static String name = "neuroblast (sensu Nematoda and Protostomia)";
	public static String def = "";
}


@Term
interface GlioblastSensuVertebrata extends Glioblast, NeuronAssociatedCellSensuVertebrata {
	public static String id = "CL:0000339";
	public static String name = "glioblast (sensu Vertebrata)";
	public static String def = "";
}


@Term
interface GlioblastSensuNematodaAndProtostomia extends Glioblast, NeuronAssociatedCellSensuNematodaAndProtostomia {
	public static String id = "CL:0000340";
	public static String name = "glioblast (sensu Nematoda and Protostomia)";
	public static String def = "";
}


@Term
interface PigmentCellSensuNematodaAndProtostomia extends PigmentCell, AnimalCell {
	public static String id = "CL:0000341";
	public static String name = "pigment cell (sensu Nematoda and Protostomia)";
	public static String def = "";
}


@Term
interface PigmentCellSensuVertebrata extends PigmentCell, AnimalCell {
	public static String id = "CL:0000342";
	public static String name = "pigment cell (sensu Vertebrata)";
	public static String def = "";
}


@Term
interface VisualPigmentCellSensuVertebrata extends VisualPigmentCell, PigmentCellSensuVertebrata {
	public static String id = "CL:0000343";
	public static String name = "visual pigment cell (sensu Vertebrata)";
	public static String def = "";
}


@Term
interface NonVisualCellSensuVertebrata extends PigmentCellSensuVertebrata {
	public static String id = "CL:0000344";
	public static String name = "non-visual cell (sensu Vertebrata)";
	public static String def = "";
}


@Term
interface DentalPapillaCell {
	public static String id = "CL:0000345";
	public static String name = "dental papilla cell";
	public static String def = "";

	@Relates("develops_from")
	public CranialNeuralCrestCell DentalPapillaCell_develops_from();
}


@Term
interface HairPapillaCell {
	public static String id = "CL:0000346";
	public static String name = "hair papilla cell";
	public static String def = "";

	@Relates("develops_from")
	public NeuralCrestCell HairPapillaCell_develops_from();
}


@Term
interface ScleralCell extends StructuralCell {
	public static String id = "CL:0000347";
	public static String name = "scleral cell";
	public static String def = "\"A cell of the sclera of the eye.\" [GOC:add]";

	@Relates("develops_from")
	public CranialNeuralCrestCell ScleralCell_develops_from();
}


@Term
interface ChoroidalCellOfTheEye extends StructuralCell {
	public static String id = "CL:0000348";
	public static String name = "choroidal cell of the eye";
	public static String def = "\"A cell of the choroid of the eye.\" [GOC:add]";

	@Relates("develops_from")
	public CranialNeuralCrestCell ChoroidalCellOfTheEye_develops_from();
}


@Term
interface ExtraembryonicCell extends AnimalCell {
	public static String id = "CL:0000349";
	public static String name = "extraembryonic cell";
	public static String def = "";
}


@Term
interface AmnioserosalCell extends ExtraembryonicCell, AnimalCell {
	public static String id = "CL:0000350";
	public static String name = "amnioserosal cell";
	public static String def = "";
}


@Term
interface TrophoblastCell extends ExtraembryonicCell, AnimalCell {
	public static String id = "CL:0000351";
	public static String name = "trophoblast cell";
	public static String def = "\"A cell lining the outside of the blastocyst. After binding to the endometrium, trophoblast cells develop into two distinct layers, an inner layer of mononuclear cytotrophoblast cells and an outer layer of continuous multinuclear cytoplasm, the syncytiotrophoblast cells, which form the early fetal-maternal interface.\" [MESH:A.11.936]";
}


@Term
interface EpiblastCell extends TotipotentStemCell, AnimalCell {
	public static String id = "CL:0000352";
	public static String name = "epiblast cell";
	public static String def = "";
}


@Term
interface BlastodermCell extends EarlyEmbryonicCell, AnimalCell {
	public static String id = "CL:0000353";
	public static String name = "blastoderm cell";
	public static String def = "\"An undifferentiated cell produced by early cleavages of the fertilized egg (zygote).\" [MESH:A.11.104]";
}


@Term
interface BlastemalCell extends MultiFateStemCell {
	public static String id = "CL:0000354";
	public static String name = "blastemal cell";
	public static String def = "";
}


@Term
interface MuscleStemCell extends SingleFateStemCell, AnimalCell, MusclePrecursorCell {
	public static String id = "CL:0000355";
	public static String name = "muscle stem cell";
	public static String def = "";
}


@Term
interface HairMatrixStemCell extends SingleFateStemCell, AnimalCell {
	public static String id = "CL:0000356";
	public static String name = "hair matrix stem cell";
	public static String def = "";
}


@Term
interface StratifiedEpithelialStemCell extends EpithelialFateStemCell, AnimalCell {
	public static String id = "CL:0000357";
	public static String name = "stratified epithelial stem cell";
	public static String def = "";
}


@Term
interface SphincterAssociatedSmoothMuscleCell extends SmoothMuscleCell {
	public static String id = "CL:0000358";
	public static String name = "sphincter associated smooth muscle cell";
	public static String def = "";
}


@Term
interface VascularAssociatedSmoothMuscleCell extends SmoothMuscleCell {
	public static String id = "CL:0000359";
	public static String name = "vascular associated smooth muscle cell";
	public static String def = "";
}


@Term
interface MorulaCell extends EarlyEmbryonicCell, AnimalCell {
	public static String id = "CL:0000360";
	public static String name = "morula cell";
	public static String def = "\"A cell of the early embryo at the developmental stage in which the blastomeres, resulting from repeated mitotic divisions of the fertilized ovum (zygote), form a compact cell mass.\" [MESH:A.16.254.270.550]";
}


@Term
interface GastrulaCell extends EarlyEmbryonicCell, AnimalCell {
	public static String id = "CL:0000361";
	public static String name = "gastrula cell";
	public static String def = "\"A cell of the embryo in the early stage following the blastula, characterized by morphogenetic cell movements, cell differentiation, and the formation of the three germ layers.\" [MESH:A.16.254.412]";
}


@Term
interface EpidermalCell extends SquamousEpithelialCell {
	public static String id = "CL:0000362";
	public static String name = "epidermal cell";
	public static String def = "\"A cell found in the outermost layer of the organism.\" [MA:ma]";
}


@Term
interface AxialCell extends StructuralCell {
	public static String id = "CL:0000363";
	public static String name = "axial cell";
	public static String def = "\"A secondary vascular cell that develops from the fusiform cambial initials and oriented with their longest diameter parallel with the main axis of stem or root. These cells make up the axial system, also known as vertical or longitudinal system.\" [ISBN:0471245208]";

	@Relates("develops_from")
	public FusiformInitial AxialCell_develops_from();
}


@Term
interface RayCell extends StructuralCell {
	public static String id = "CL:0000364";
	public static String name = "ray cell";
	public static String def = "\"A cell that develops from the ray initial and composes all rays (panels of tissue variable in height and width, formed by the ray initials in the vascular cambium and extending radially in the secondary xylem and secondary phloem) in the secondary vascular tissues.\" [ISBN:0471245208]";

	@Relates("develops_from")
	public RayInitial RayCell_develops_from();
}


@Term
interface Zygote extends CellByLineage, AnimalCell, PlantCell {
	public static String id = "CL:0000365";
	public static String name = "zygote";
	public static String def = "\"Diploid cell produced by the fusion of sperm cell nucleus and egg cell.\" [ISBN:0471245208]";
}


@Term
interface SpermCellSensuViridiplantae extends MaleGamete {
	public static String id = "CL:0000366";
	public static String name = "sperm cell (sensu Viridiplantae)";
	public static String def = "\"Male gamete, part of male germ unit.\" [ISBN:0471245208]";

	@Relates("develops_from")
	public GenerativeCell SpermCellSensuViridiplantae_develops_from();
}


@Term
interface SheathCellSensuNematoda extends SupportCellSensuNematoda {
	public static String id = "CL:0000367";
	public static String name = "sheath cell (sensu Nematoda)";
	public static String def = "";
}


@Term
interface MyrosinCell extends StuffAccumulatingCell, PlantCell {
	public static String id = "CL:0000368";
	public static String name = "myrosin cell";
	public static String def = "\"Cell containing glucosinolates ('mustard oil glucosides') and myrosinases, enzymes hydrolyzing the glucosinolates. Occurs in eleven dicotyledon families, the two largest of which are the Brassicaceae and Euphorbiaceae.\" [ISBN:0471245208]";
}


@Term
interface SingleCellSarcomere extends MuscleCell {
	public static String id = "CL:0000369";
	public static String name = "single cell sarcomere";
	public static String def = "";
}


@Term
interface TransferCell extends TransportingCell, ParenchymalCell {
	public static String id = "CL:0000370";
	public static String name = "transfer cell";
	public static String def = "\"Parenchyma cell with the wall ingrowth (or invaginations) that increase the surface of the plasmalemma. Appears to be specialized for short-distance transfer of solutes.\" [ISBN:0471245208]";
}


@Term
interface Protoplast extends ExperimentallyModifiedCell {
	public static String id = "CL:0000371";
	public static String name = "protoplast";
	public static String def = "\"The cell protoplasm after removal of the cell wall.\" [ISBN:08199377X]";
}


@Term
interface TormogenCell extends SensoryEpithelialCell, SupportCellSensuNematodaAndProtostomia {
	public static String id = "CL:0000372";
	public static String name = "tormogen cell";
	public static String def = "";
}


@Term
interface Histoblast extends SimpleColumnarEpithelialCell {
	public static String id = "CL:0000373";
	public static String name = "histoblast";
	public static String def = "";
}


@Term
interface TrichogenCell extends SensoryEpithelialCell {
	public static String id = "CL:0000374";
	public static String name = "trichogen cell";
	public static String def = "";
}


@Term
interface OsteoprogenitorCell extends SingleFateStemCell {
	public static String id = "CL:0000375";
	public static String name = "osteoprogenitor cell";
	public static String def = "";

	@Relates("develops_from")
	public MesenchymeCondensationCell OsteoprogenitorCell_develops_from();
}


@Term
interface HumidityReceptorCell extends ReceptorCellSensuAnimalia {
	public static String id = "CL:0000376";
	public static String name = "humidity receptor cell";
	public static String def = "";
}


@Term
interface Tracheoblast extends BranchedDuctEpithelialCell {
	public static String id = "CL:0000377";
	public static String name = "tracheoblast";
	public static String def = "";
}


@Term
interface SupportCellSensuNematodaAndProtostomia extends SupportiveCell {
	public static String id = "CL:0000378";
	public static String name = "support cell (sensu Nematoda and Protostomia)";
	public static String def = "";
}


@Term
interface SensoryProcessingNeuron extends Neuron {
	public static String id = "CL:0000379";
	public static String name = "sensory processing neuron";
	public static String def = "";
}


@Term
interface ThecogenCell extends SupportCellSensuNematodaAndProtostomia {
	public static String id = "CL:0000380";
	public static String name = "thecogen cell";
	public static String def = "";
}


@Term
interface NeurosecretoryNeuron extends EfferentNeuron {
	public static String id = "CL:0000381";
	public static String name = "neurosecretory neuron";
	public static String def = "";
}


@Term
interface Scolopidium extends SupportCellSensuNematodaAndProtostomia {
	public static String id = "CL:0000382";
	public static String name = "scolopidium";
	public static String def = "";
}


@Term
interface NephrogenicMesenchymeStemCell extends MultiFateStemCell {
	public static String id = "CL:0000383";
	public static String name = "nephrogenic mesenchyme stem cell";
	public static String def = "";

	@Relates("develops_from")
	public MesenchymalCell NephrogenicMesenchymeStemCell_develops_from();
}


@Term
interface LigamentCell extends SupportiveCell {
	public static String id = "CL:0000384";
	public static String name = "ligament cell";
	public static String def = "";
}


@Term
interface ProhemocyteSensuNematodaAndProtostomia extends BloodCellSensuNematodaAndProtostomia {
	public static String id = "CL:0000385";
	public static String name = "prohemocyte (sensu Nematoda and Protostomia)";
	public static String def = "";
}


@Term
interface AttachmentCell extends SupportiveCell {
	public static String id = "CL:0000386";
	public static String name = "attachment cell";
	public static String def = "";
}


@Term
interface HemocyteSensuNematodaAndProtostomia extends PhagocyteSensuNematodaAndProtostomia {
	public static String id = "CL:0000387";
	public static String name = "hemocyte (sensu Nematoda and Protostomia)";
	public static String def = "";

	@Relates("develops_from")
	public ProhemocyteSensuNematodaAndProtostomia HemocyteSensuNematodaAndProtostomia_develops_from();
}


@Term
interface TendonCell extends AttachmentCell {
	public static String id = "CL:0000388";
	public static String name = "tendon cell";
	public static String def = "";
}


@Term
interface SocketCellSensuNematoda extends SupportCellSensuNematoda, CuticleSecretingCell {
	public static String id = "CL:0000389";
	public static String name = "socket cell (sensu Nematoda)";
	public static String def = "";
}


@Term
interface BloodCellSensuNematodaAndProtostomia extends BloodCell {
	public static String id = "CL:0000390";
	public static String name = "blood cell (sensu Nematoda and Protostomia)";
	public static String def = "";
}


@Term
interface PodocyteSensuDiptera {
	public static String id = "CL:0000391";
	public static String name = "podocyte (sensu Diptera)";
	public static String def = "";

	@Relates("develops_from")
	public ProcrystalCell PodocyteSensuDiptera_develops_from();
}


@Term
interface CrystalCell extends PodocyteSensuDiptera {
	public static String id = "CL:0000392";
	public static String name = "crystal cell";
	public static String def = "";
}


@Term
interface ElectricallyResponsiveCell extends ElectricallyActiveCell {
	public static String id = "CL:0000393";
	public static String name = "electrically responsive cell";
	public static String def = "\"A cell whose function is determined by its response to an electric signal.\" [FB:ma]";
}


@Term
interface Plasmatocyte extends HemocyteSensuNematodaAndProtostomia {
	public static String id = "CL:0000394";
	public static String name = "plasmatocyte";
	public static String def = "";
}


@Term
interface ProcrystalCell extends HemocyteSensuNematodaAndProtostomia {
	public static String id = "CL:0000395";
	public static String name = "procrystal cell";
	public static String def = "";
}


@Term
interface Lamellocyte extends Plasmatocyte {
	public static String id = "CL:0000396";
	public static String name = "lamellocyte";
	public static String def = "";
}


@Term
interface GanglionInterneuron extends Interneuron {
	public static String id = "CL:0000397";
	public static String name = "ganglion interneuron";
	public static String def = "";
}


@Term
interface PolygonalCell extends HemocyteSensuNematodaAndProtostomia {
	public static String id = "CL:0000398";
	public static String name = "polygonal cell";
	public static String def = "";
}


@Term
interface PhloemElement extends TransportingCell {
	public static String id = "CL:0000399";
	public static String name = "phloem element";
	public static String def = "";

	@Relates("develops_from")
	public PhloemInitial PhloemElement_develops_from();
}


@Term
interface PavementCell extends EpidermalCell {
	public static String id = "CL:0000400";
	public static String name = "pavement cell";
	public static String def = "\"An epidermal cell with a characteristic convoluted anticlinal cell wall that gives a jigsaw like appearance to the lamina.\" [ISBN:087694289]";

	@Relates("develops_from")
	public EpidermalInitial PavementCell_develops_from();
}


@Term
interface MacrophageSensuDiptera extends Plasmatocyte {
	public static String id = "CL:0000401";
	public static String name = "macrophage (sensu Diptera)";
	public static String def = "";
}


@Term
interface CNSInterneuron extends Interneuron, CNSNeuronSensuVertebrata {
	public static String id = "CL:0000402";
	public static String name = "CNS interneuron";
	public static String def = "";
}


@Term
interface ElectricallySignalingCell extends ElectricallyActiveCell {
	public static String id = "CL:0000404";
	public static String name = "electrically signaling cell";
	public static String def = "\"A cell that initiates an electrical signal and passes that signal to another cell.\" [FB:ma]";
}


@Term
interface Neuroepidermoblast extends NeuroblastSensuNematodaAndProtostomia {
	public static String id = "CL:0000405";
	public static String name = "neuroepidermoblast";
	public static String def = "";
}


@Term
interface CNSShortRangeInterneuron extends CNSInterneuron {
	public static String id = "CL:0000406";
	public static String name = "CNS short range interneuron";
	public static String def = "";
}


@Term
interface ScolopidialLigamentCell extends LigamentCell {
	public static String id = "CL:0000407";
	public static String name = "scolopidial ligament cell";
	public static String def = "";
}


@Term
interface MaleGamete extends Gamete {
	public static String id = "CL:0000408";
	public static String name = "male gamete";
	public static String def = "";
}


@Term
interface ScolopidialSheathCell extends SheathCell {
	public static String id = "CL:0000409";
	public static String name = "scolopidial sheath cell";
	public static String def = "";
}


@Term
interface CNSLongRangeInterneuron extends CNSInterneuron {
	public static String id = "CL:0000410";
	public static String name = "CNS long range interneuron";
	public static String def = "";
}


@Term
interface HypodermalCell extends SquamousEpithelialCell, MultinucleateCell {
	public static String id = "CL:0000411";
	public static String name = "hypodermal cell";
	public static String def = "";
}


@Term
interface PolyploidCell extends CellByPloidy {
	public static String id = "CL:0000412";
	public static String name = "polyploid cell";
	public static String def = "\"A cell whose nucleus, or nuclei, each contain more than two haploid genomes.\" [FB:ma]";
}


@Term
interface HaploidCell extends CellByPloidy {
	public static String id = "CL:0000413";
	public static String name = "haploid cell";
	public static String def = "\"A cell whose nucleus contains a single haploid genome.\" [FB:ma]";
}


@Term
interface CellByPloidy extends CellByClass {
	public static String id = "CL:0000414";
	public static String name = "cell by ploidy";
	public static String def = "\"A classification of cells by the number of haploid genome equivalents of their nucleus or nuclei.\" [FB:ma]";
}


@Term
interface DiploidCell extends CellByPloidy {
	public static String id = "CL:0000415";
	public static String name = "diploid cell";
	public static String def = "\"A cell whose nucleus has two haploid genomes.\" [FB:ma]";
}


@Term
interface PolyteneCell extends PolyploidCell {
	public static String id = "CL:0000416";
	public static String name = "polytene cell";
	public static String def = "";
}


@Term
interface EndopolyploidCell extends PolyploidCell {
	public static String id = "CL:0000417";
	public static String name = "endopolyploid cell";
	public static String def = "";
}


@Term
interface ArcadeCell extends AnimalCell {
	public static String id = "CL:0000418";
	public static String name = "arcade cell";
	public static String def = "";
}


@Term
interface SeamCell extends EpithelialFateStemCell {
	public static String id = "CL:0000419";
	public static String name = "seam cell";
	public static String def = "";
}


@Term
interface SyncytialEpithelialCell extends EpithelialCell, MultinucleateCell, AnimalCell {
	public static String id = "CL:0000420";
	public static String name = "syncytial epithelial cell";
	public static String def = "";
}


@Term
interface Coelomocyte extends CirculatingCell, PhagocyteSensuNematodaAndProtostomia {
	public static String id = "CL:0000421";
	public static String name = "coelomocyte";
	public static String def = "";
}


@Term
interface MitogenicSignalingCell extends CellByFunction, AnimalCell {
	public static String id = "CL:0000422";
	public static String name = "mitogenic signaling cell";
	public static String def = "\"A cell whose primary function is to cause growth by stimulating cell division in its immediate cellular environment.\" [FB:ma]";
}


@Term
interface TipCell extends MitogenicSignalingCell {
	public static String id = "CL:0000423";
	public static String name = "tip cell";
	public static String def = "";
}


@Term
interface ExcretoryCell extends SecretoryCell, AnimalCell {
	public static String id = "CL:0000424";
	public static String name = "excretory cell";
	public static String def = "";
}


@Term
interface PoreCell extends AnimalCell, CuticleSecretingCell {
	public static String id = "CL:0000425";
	public static String name = "pore cell";
	public static String def = "\"Forms the terminal part of the cuticle-lined excretory duct of C. elegans.\" [JB:jb]";
}


@Term
interface ScaffoldCell extends ApoptosisFatedCell {
	public static String id = "CL:0000426";
	public static String name = "scaffold cell";
	public static String def = "";
}


@Term
interface GLRCell extends AnimalCell {
	public static String id = "CL:0000427";
	public static String name = "GLR cell";
	public static String def = "";
}


@Term
interface YolkCell extends StuffAccumulatingCell, AnimalCell {
	public static String id = "CL:0000428";
	public static String name = "yolk cell";
	public static String def = "";
}


@Term
interface ImaginalDiscCell extends SimpleColumnarEpithelialCell, AnimalCell {
	public static String id = "CL:0000429";
	public static String name = "imaginal disc cell";
	public static String def = "";
}


@Term
interface Xanthophore extends PigmentCell {
	public static String id = "CL:0000430";
	public static String name = "xanthophore";
	public static String def = "\"A pigment cell derived from the neural crest. Contains cartenoid pigments in structures called pterinosomes or xanthosomes. This gives an appearance ranging from a golden yellow to orange and red.\" [SANBI:mhl]";

	@Relates("develops_from")
	public Xanthoblast Xanthophore_develops_from();
}


@Term
interface Iridophore extends PigmentCell {
	public static String id = "CL:0000431";
	public static String name = "iridophore";
	public static String def = "\"A pigment cell derived from the neural crest. The cell contains flat light-reflecting platelets, probably of guanine, in stacks called reflecting platets or iridisomes. The color-generating components produce a silver, gold, or iridescent color.\" [SANBI:mhl]";

	@Relates("develops_from")
	public Iridoblast Iridophore_develops_from();
}


@Term
interface ReticularCell extends Fibroblast {
	public static String id = "CL:0000432";
	public static String name = "reticular cell";
	public static String def = "";
}


@Term
interface FunctionalMegaspore extends Megaspore {
	public static String id = "CL:0000433";
	public static String name = "functional megaspore";
	public static String def = "\"In monosporic and bisporic megasporogenesis: the megaspore(s) that will undergo megagametogenesis.\" [TAIR:lr]";
}


@Term
interface EccrineCell extends SecretoryCell {
	public static String id = "CL:0000434";
	public static String name = "eccrine cell";
	public static String def = "\"A secretory cell that discharges its product without loss of cytoplasm.\" [ISBN:0198547684]";
}


@Term
interface AlkaliSecretingCell extends SecretoryCell {
	public static String id = "CL:0000435";
	public static String name = "alkali secreting cell";
	public static String def = "";
}


@Term
interface VaginalLubricantSecretingCell extends SecretoryCell {
	public static String id = "CL:0000436";
	public static String name = "vaginal lubricant secreting cell";
	public static String def = "";
}


@Term
interface FollicleStimulatingHormoneSecretingCell extends PeptideHormoneSecretingCell, BasophilCellOfAnteriorLobeOfHypophysis {
	public static String id = "CL:0000437";
	public static String name = "follicle stimulating hormone secreting cell";
	public static String def = "";
}


@Term
interface LuteinizingHormoneSecretingCell extends PeptideHormoneSecretingCell, BasophilCellOfAnteriorLobeOfHypophysis {
	public static String id = "CL:0000438";
	public static String name = "luteinizing hormone secreting cell";
	public static String def = "";
}


@Term
interface ProlactinSecretingCell extends PeptideHormoneSecretingCell, AcidophilCell {
	public static String id = "CL:0000439";
	public static String name = "prolactin secreting cell";
	public static String def = "\"An acidophilic cell of the anterior pituitary that produces prolactin.\" [SANBI:mhl]";
}


@Term
interface MelanocyteStimulatingHormoneSecretingCell extends PeptideHormoneSecretingCell {
	public static String id = "CL:0000440";
	public static String name = "melanocyte stimulating hormone secreting cell";
	public static String def = "\"A cell of the intermediate pituitary that produces melanocyte stimulating hormone.\" [SANBI:mhl]";
}


@Term
interface FollicleStemCell extends EpithelialFateStemCell, AnimalCell {
	public static String id = "CL:0000441";
	public static String name = "follicle stem cell";
	public static String def = "";
}


@Term
interface FollicularDendriticCell extends DefensiveCell {
	public static String id = "CL:0000442";
	public static String name = "follicular dendritic cell";
	public static String def = "\"A cell with extensive dendritic processes found in the B cell areas (primary follicles and germinal centers) of lymphoid tissue. They are unrelated to the dendritic cell associated with T cells. Follicular dendritic cells have Fc receptors and C3b receptors, but unlike other dendritic cells, they do not process or present antigen in a way that allows recognition by T cells. Instead, they hold antigen in the form of immune complexes on their surfaces for long periods and can present antigen to B cells during an immune response.\" [ISBN:127520252]";
}


@Term
interface CalcitoninSecretingCell extends PeptideHormoneSecretingCell {
	public static String id = "CL:0000443";
	public static String name = "calcitonin secreting cell";
	public static String def = "";
}


@Term
interface ObliquelyStriatedMuscleCell extends StriatedMuscleCell {
	public static String id = "CL:0000444";
	public static String name = "obliquely striated muscle cell";
	public static String def = "";
}


@Term
interface ApoptosisFatedCell extends CellByFunction, AnimalCell {
	public static String id = "CL:0000445";
	public static String name = "apoptosis fated cell";
	public static String def = "";
}


@Term
interface ParathyroidHormoneSecretingCell extends PeptideHormoneSecretingCell {
	public static String id = "CL:0000446";
	public static String name = "parathyroid hormone secreting cell";
	public static String def = "";
}


@Term
interface CarbohydrateSecretingCell extends SecretoryCell {
	public static String id = "CL:0000447";
	public static String name = "carbohydrate secreting cell";
	public static String def = "";
}


@Term
interface WhiteFatCell extends FatCell {
	public static String id = "CL:0000448";
	public static String name = "white fat cell";
	public static String def = "";

	@Relates("develops_from")
	public FibroblastNeuralCrestDerived WhiteFatCell_develops_from();
}


@Term
interface BrownFatCell extends FatCell {
	public static String id = "CL:0000449";
	public static String name = "brown fat cell";
	public static String def = "\"A cell from the thermogenic form of adipose tissue found in newborns of many species, including humans, and in hibernating mammals. Brown fat is capable of rapid liberation of energy and seems to be important in the maintenance of body temperature immediately after birth and upon waking from hibernation.\" [MESH:A.10.165.114.322]";
}


@Term
interface Lipocyte extends FatCell {
	public static String id = "CL:0000450";
	public static String name = "lipocyte";
	public static String def = "";
}


@Term
interface DendriticCell extends Leukocyte {
	public static String id = "CL:0000451";
	public static String name = "dendritic cell";
	public static String def = "\"A cell of hematopoietic origin, typically resident in particular tissues, specialized in the uptake, processing, and transport of antigens to lymph nodes for the purpose of stimulating an immune response via T cell activation.\" [GOC:add, ISBN:0781735149]";
}


@Term
interface ThyroidHormoneSecretingCell extends EndocrineCell {
	public static String id = "CL:0000452";
	public static String name = "thyroid hormone secreting cell";
	public static String def = "";
}


@Term
interface LangerhansCell extends ConventionalDendriticCell {
	public static String id = "CL:0000453";
	public static String name = "Langerhans cell";
	public static String def = "\"Langerhans cell is a conventional dendritic cell that has plasma membrane part CD207. A Langerhans cell is a stellate dendritic cell of myeloid origin, that appears clear on light microscopy and has a dark-staining, indented nucleus and characteristic inclusions (Birbeck granules) in the cytoplasm; Langerhans cells are found principally in the stratum spinosum of the epidermis, but they also occur in other stratified epithelia and have been identified in the lung, lymph nodes, spleen, and thymus.\" [GO_REF:0000031, GOC:add, GOC:amm, ISBN:0721601464, ISBN:0781735149, PMID:17850486, PMID:18082389]";
}


@Term
interface EpinephrinSecretingCell extends BiogenicAmineSecretingCell {
	public static String id = "CL:0000454";
	public static String name = "epinephrin secreting cell";
	public static String def = "";
}


@Term
interface StarchSheathCell extends StuffAccumulatingCell, PlantCell {
	public static String id = "CL:0000455";
	public static String name = "starch sheath cell";
	public static String def = "\"A cell characterized by conspicuous and rather stable accumulation of starch.\" [ISBN:044174520]";
}


@Term
interface MineralocorticoidSecretingCell extends SteroidHormoneSecretingCell {
	public static String id = "CL:0000456";
	public static String name = "mineralocorticoid secreting cell";
	public static String def = "";
}


@Term
interface BiogenicAmineSecretingCell extends EndocrineCell {
	public static String id = "CL:0000457";
	public static String name = "biogenic amine secreting cell";
	public static String def = "";
}


@Term
interface SerotinSecretingCell extends BiogenicAmineSecretingCell {
	public static String id = "CL:0000458";
	public static String name = "serotin secreting cell";
	public static String def = "";
}


@Term
interface NorepinephrinSecretingCell extends BiogenicAmineSecretingCell {
	public static String id = "CL:0000459";
	public static String name = "norepinephrin secreting cell";
	public static String def = "";
}


@Term
interface GlucocorticoidSecretingCell extends SteroidHormoneSecretingCell {
	public static String id = "CL:0000460";
	public static String name = "glucocorticoid secreting cell";
	public static String def = "";
}


@Term
interface ReninSecretingCell extends ProteinSecretingCell {
	public static String id = "CL:0000461";
	public static String name = "renin secreting cell";
	public static String def = "";
}


@Term
interface AdepithelialCell extends MusclePrecursorCell {
	public static String id = "CL:0000462";
	public static String name = "adepithelial cell";
	public static String def = "";
}


@Term
interface EpidermalCellSensuInsecta extends ColumnarCuboidalEpithelialCell {
	public static String id = "CL:0000463";
	public static String name = "epidermal cell (sensu Insecta)";
	public static String def = "\"A columnar/cuboidal epithelial cell which secretes cuticle from its apical side.\" [FlyBase:ds]";

	@Relates("develops_from")
	public Epidermoblast EpidermalCellSensuInsecta_develops_from();
}


@Term
interface Epidermoblast extends NonTerminallyDifferentiatedCell, AnimalCell {
	public static String id = "CL:0000464";
	public static String name = "epidermoblast";
	public static String def = "";

	@Relates("develops_from")
	public SurfaceEctodermalCell Epidermoblast_develops_from();
}


@Term
interface CardioblastSensuArthropoda extends CardiacMuscleMyoblast {
	public static String id = "CL:0000465";
	public static String name = "cardioblast (sensu Arthropoda)";
	public static String def = "";
}


@Term
interface AdrenocorticotropicHormoneSecretingCell extends PeptideHormoneSecretingCell, BasophilCellOfAnteriorLobeOfHypophysis {
	public static String id = "CL:0000467";
	public static String name = "adrenocorticotropic hormone secreting cell";
	public static String def = "\"A basophil cell of the anterior pituitary that produces adrenocorticotropic hormone, or corticotropin.\" [SANBI:mhl]";
}


@Term
interface Neuroglioblast extends NeuronalStemCell, NonTerminallyDifferentiatedCell {
	public static String id = "CL:0000468";
	public static String name = "neuroglioblast";
	public static String def = "";
}


@Term
interface GanglionMotherCell extends Neuroglioblast {
	public static String id = "CL:0000469";
	public static String name = "ganglion mother cell";
	public static String def = "";
}


@Term
interface DigestiveEnzymeSecretingCell extends ProteinSecretingCell {
	public static String id = "CL:0000470";
	public static String name = "digestive enzyme secreting cell";
	public static String def = "";
}


@Term
interface ChlorenchymaCell extends PhotosyntheticCell, ParenchymalCell {
	public static String id = "CL:0000472";
	public static String name = "chlorenchyma cell";
	public static String def = "\"Parenchyma cells containing chloroplasts; a component of leaf mesophyll and other green parenchyma tissue.\" [ISBN:0471245208]";
}


@Term
interface DefensiveCell extends CellByFunction {
	public static String id = "CL:0000473";
	public static String name = "defensive cell";
	public static String def = "\"A cell whose primary function is to protect the organism.\" [JB:jb]";
}


@Term
interface PericardialCell extends PhagocyteSensuNematodaAndProtostomia {
	public static String id = "CL:0000474";
	public static String name = "pericardial cell";
	public static String def = "";
}


@Term
interface DegenerateMegaspore extends Megaspore {
	public static String id = "CL:0000475";
	public static String name = "degenerate megaspore";
	public static String def = "\"In monosporic and bisporic megasporogenesis: the megaspore(s) that do not participate in megagametogenesis.\" [TAIR:lr]";
}


@Term
interface ThyroidStimulatingHormoneSecretingCell extends PeptideHormoneSecretingCell, BasophilCellOfAnteriorLobeOfHypophysis {
	public static String id = "CL:0000476";
	public static String name = "thyroid stimulating hormone secreting cell";
	public static String def = "\"A basophil cell of the anterior pituitary that produces thyroid stimulating hormone, thyrotrophin.\" [SANBI:mhl]";
}


@Term
interface FollicleCell extends ColumnarCuboidalEpithelialCell {
	public static String id = "CL:0000477";
	public static String name = "follicle cell";
	public static String def = "";

	@Relates("develops_from")
	public FollicleStemCell FollicleCell_develops_from();
}


@Term
interface OxytocinStimulatingHormoneSecretingCell extends PeptideHormoneSecretingCell {
	public static String id = "CL:0000478";
	public static String name = "oxytocin stimulating hormone secreting cell";
	public static String def = "";
}


@Term
interface VasopressinStimulatingHormoneSecretingCell extends PeptideHormoneSecretingCell {
	public static String id = "CL:0000479";
	public static String name = "vasopressin stimulating hormone secreting cell";
	public static String def = "";
}


@Term
interface SecretinStimulatingHormoneSecretingCell extends PeptideHormoneSecretingCell {
	public static String id = "CL:0000480";
	public static String name = "secretin stimulating hormone secreting cell";
	public static String def = "";
}


@Term
interface CholecystokinStimulatingHormoneSecretingCell extends PeptideHormoneSecretingCell {
	public static String id = "CL:0000481";
	public static String name = "cholecystokin stimulating hormone secreting cell";
	public static String def = "";
}


@Term
interface JuvenileHormoneSecretingCell extends EndocrineCell {
	public static String id = "CL:0000482";
	public static String name = "juvenile hormone secreting cell";
	public static String def = "";
}


@Term
interface BombesinStimulatingHormoneSecretingCell extends PeptideHormoneSecretingCell {
	public static String id = "CL:0000483";
	public static String name = "bombesin stimulating hormone secreting cell";
	public static String def = "";
}


@Term
interface ConnectiveTissueTypeMastCell extends MastCell {
	public static String id = "CL:0000484";
	public static String name = "connective tissue type mast cell";
	public static String def = "\"A mast cell of the connective tissue.\" [GOC:add]";
}


@Term
interface MucosalTypeMastCell extends MastCell {
	public static String id = "CL:0000485";
	public static String name = "mucosal type mast cell";
	public static String def = "\"A mast cell of a mucosal tissue.\" [GOC:add]";
}


@Term
interface GarlandCell extends BinucleateCell, PhagocyteSensuNematodaAndProtostomia {
	public static String id = "CL:0000486";
	public static String name = "garland cell";
	public static String def = "";
}


@Term
interface Oenocyte extends SecretoryCell {
	public static String id = "CL:0000487";
	public static String name = "oenocyte";
	public static String def = "\"A large secretory cell found in clusters underlying the epidermis of the abdominal segments of larval abdominal segments.\" [GOC:bf, PMID:11171397]";
}


@Term
interface VisibleLightPhotoreceptorCell extends PhotoreceptorCell {
	public static String id = "CL:0000488";
	public static String name = "visible light photoreceptor cell";
	public static String def = "";
}


@Term
interface ScotopicPhotoreceptorCell extends PhotoreceptorCell {
	public static String id = "CL:0000489";
	public static String name = "scotopic photoreceptor cell";
	public static String def = "";
}


@Term
interface PhotopicPhotoreceptorCell extends VisibleLightPhotoreceptorCell {
	public static String id = "CL:0000490";
	public static String name = "photopic photoreceptor cell";
	public static String def = "";
}


@Term
interface CD4PositiveHelperTCell extends CD4PositiveAlphaBetaTCell, HelperTCell {
	public static String id = "CL:0000492";
	public static String name = "CD4-positive helper T cell";
	public static String def = "\"A CD4-positive, alpha-beta T cell that cooperates with other lymphocytes via direct contact or cytokine release to initiate a variety of immune functions.\" [GO_REF:0000031, GOC:add, GOC:pam, ISBN:0781735149, MESH:A.11.118.637.555.567.569.200.400]";

	@Relates("develops_from")
	public ActivatedCD4PositiveAlphaBetaTCell CD4PositiveHelperTCell_develops_from();
}


@Term
interface UVSensitivePhotoreceptorCell extends PhotoreceptorCell {
	public static String id = "CL:0000494";
	public static String name = "UV sensitive photoreceptor cell";
	public static String def = "";
}


@Term
interface BlueSensitivePhotoreceptorCell extends PhotopicPhotoreceptorCell {
	public static String id = "CL:0000495";
	public static String name = "blue sensitive photoreceptor cell";
	public static String def = "";
}


@Term
interface GreenSensitivePhotoreceptorCell extends PhotopicPhotoreceptorCell {
	public static String id = "CL:0000496";
	public static String name = "green sensitive photoreceptor cell";
	public static String def = "";
}


@Term
interface RedSensitivePhotoreceptorCell extends PhotopicPhotoreceptorCell {
	public static String id = "CL:0000497";
	public static String name = "red sensitive photoreceptor cell";
	public static String def = "";
}


@Term
interface InhibitoryInterneuron extends Interneuron {
	public static String id = "CL:0000498";
	public static String name = "inhibitory interneuron";
	public static String def = "";
}


@Term
interface StromalCell {
	public static String id = "CL:0000499";
	public static String name = "stromal cell";
	public static String def = "\"A connective tissue cell of an organ found in the loose connective tissue. These are most often associated with the uterine mucosa and the ovary as well as the hematopoietic system and elsewhere.\" [MESH:A.11.329.830]";

	@Relates("develops_from")
	public MesenchymalCell StromalCell_develops_from();
}


@Term
interface FollicularEpithelialCell extends EpithelialCell, AnimalCell {
	public static String id = "CL:0000500";
	public static String name = "follicular epithelial cell";
	public static String def = "";
}


@Term
interface GranulosaCell extends SteroidHormoneSecretingCell {
	public static String id = "CL:0000501";
	public static String name = "granulosa cell";
	public static String def = "\"A supporting cell for the developing female gamete in the ovary of mammals. They develop from the coelomic epithelial cells of the gonadal ridge. Granulosa cells form a single layer around the mammalian oocyte in the primordial ovarian follicle and advance to form a multilayered cumulus oophorus surrounding the ovum in the Graafian follicle. The major functions of granulosa cells include the production of steroids and LH receptors.\" [MESH:A.05.360.319.114.630.535.200]";
}


@Term
interface DCell extends EnteroendocrineCell, SomatostatinSecretingCell {
	public static String id = "CL:0000502";
	public static String name = "D cell";
	public static String def = "\"A cell found throughout the gastrointestinal tract and in the pancreas. They secrete somatostatin in both an endocrine and paracrine manner. Somatostatin inhibits gastrin, cholecystokinin, insulin, glucagon, pancreatic enzymes, and gastric hydrochloric acid. A variety of substances which inhibit gastric acid secretion (vasoactive intestinal peptide, calcitonin gene-related peptide, cholecystokinin, beta-adrenergic agonists, and gastric inhibitory peptide) are thought to act by releasing somatostatin.\" [MESH:A.03.492.766.440.175]";
}


@Term
interface ThecaCell extends StromalCell, AndrogenSecretingCell {
	public static String id = "CL:0000503";
	public static String name = "theca cell";
	public static String def = "\"A flattened stroma cell forming a sheath or theca outside the basal lamina lining the mature ovarian follicle. Thecal interstitial or stromal cells are steroidogenic, and produce primarily androgens which serve as precusors of estrogens in the granulosa cells.\" [MESH:A.05.360.319.114.630.535.400]";
}


@Term
interface EnterochromaffinCell extends EnteroendocrineCell, SubstancePSecretingCell, EnkephalinSecretingCell {
	public static String id = "CL:0000504";
	public static String name = "enterochromaffin cell";
	public static String def = "\"An irregular-shaped argyrophilic cell which produces histamine, chromogranin A/pancreastatin, and an as yet unidentified peptide hormone. They are the predominant endocrine cell type of the oxyntic (acid-producing) mucosa of the mammalian stomach. ECL cells respond to gastrin by releasing their secretory products and this source of histamine acts as the positive paracrine stimulator of the release of hydrochloric acid from the parietal cell.\" [MESH:A.06.224.365]";
}


@Term
interface SubstancePSecretingCell extends PeptideHormoneSecretingCell {
	public static String id = "CL:0000505";
	public static String name = "substance P secreting cell";
	public static String def = "";
}


@Term
interface EnkephalinSecretingCell extends EndorphinSecretingCell {
	public static String id = "CL:0000506";
	public static String name = "enkephalin secreting cell";
	public static String def = "";
}


@Term
interface EndorphinSecretingCell extends PeptideHormoneSecretingCell {
	public static String id = "CL:0000507";
	public static String name = "endorphin secreting cell";
	public static String def = "";
}


@Term
interface GCell extends EnteroendocrineCell, GastrinSecretingCell {
	public static String id = "CL:0000508";
	public static String name = "G cell";
	public static String def = "\"An endocrine cell found in the pyloric gland mucosa (antral mucosa) of the stomach of mammals and responsible for the secretion of gastrin.\" [MESH:A.03.492.766.440.300]";
}


@Term
interface GastrinSecretingCell extends ProteinSecretingCell {
	public static String id = "CL:0000509";
	public static String name = "gastrin secreting cell";
	public static String def = "";
}


@Term
interface PanethCell extends GutEndothelialCell, GlandularEpithelialCell, LysozymeSecretingCell {
	public static String id = "CL:0000510";
	public static String name = "Paneth cell";
	public static String def = "\"An epithelial cell found in the basal part of the intestinal glands (crypts of Lieberkuhn). Paneth cells synthesize and secrete lysozyme and cryptdins.\" [MESH:A.03.492.411.369.700]";
}


@Term
interface AndrogenBindingProteinSecretingCell extends ProteinSecretingCell {
	public static String id = "CL:0000511";
	public static String name = "androgen binding protein secreting cell";
	public static String def = "";
}


@Term
interface ParacrineCell extends SecretoryCell {
	public static String id = "CL:0000512";
	public static String name = "paracrine cell";
	public static String def = "";
}


@Term
interface CardiacMuscleMyoblast extends Myoblast {
	public static String id = "CL:0000513";
	public static String name = "cardiac muscle myoblast";
	public static String def = "\"A precursor cell destined to differentiate into cardiac myocytes.\" [MESH:A.11.635.470]";
}


@Term
interface SmoothMuscleMyoblast extends Myoblast {
	public static String id = "CL:0000514";
	public static String name = "smooth muscle myoblast";
	public static String def = "\"A precursor cell destined to differentiate into smooth muscle myocytes.\" [MESH:A.11.635.510]";
}


@Term
interface SkeletalMuscleMyoblast extends Myoblast {
	public static String id = "CL:0000515";
	public static String name = "skeletal muscle myoblast";
	public static String def = "\"A myoblast that differentiates into skeletal muscle fibers.\" [SANBI:mhl]";
}


@Term
interface PerineuronalSatelliteCell extends NeuronAssociatedCellSensuVertebrata, GlialCellSensuVertebrata {
	public static String id = "CL:0000516";
	public static String name = "perineuronal satellite cell";
	public static String def = "\"A non-neuronal cell that surrounds the neuronal cell bodies of the ganglia.\" [MESH:A.08.340.685]";

	@Relates("develops_from")
	public GlioblastSensuVertebrata PerineuronalSatelliteCell_develops_from();
}


@Term
interface MacrophageDerivedFoamCell extends FoamCell {
	public static String id = "CL:0000517";
	public static String name = "macrophage derived foam cell";
	public static String def = "\"A type of foam cell derived from a macrophage containing lipids in small vacuoles and typically seen in atherolosclerotic lesions, as well as other conditions.\" [GOC:add]";

	@Relates("develops_from")
	public Macrophage MacrophageDerivedFoamCell_develops_from();
}


@Term
interface PhagocyteSensuVertebrata extends Phagocyte, MyeloidLeukocyte {
	public static String id = "CL:0000518";
	public static String name = "phagocyte (sensu Vertebrata)";
	public static String def = "";
}


@Term
interface PhagocyteSensuNematodaAndProtostomia extends Phagocyte, AnimalCell {
	public static String id = "CL:0000519";
	public static String name = "phagocyte (sensu Nematoda and Protostomia)";
	public static String def = "";
}


@Term
interface ProkaryoticCell extends CellByOrganism {
	public static String id = "CL:0000520";
	public static String name = "prokaryotic cell";
	public static String def = "";
}


@Term
interface FungalCell extends EukaryoticCell {
	public static String id = "CL:0000521";
	public static String name = "fungal cell";
	public static String def = "";
}


@Term
interface Spore extends CellByOrganism, ProkaryoticCell, FungalCell {
	public static String id = "CL:0000522";
	public static String name = "spore";
	public static String def = "\"The reproductive structure of bacteria, fungi and cryptograms.\" [ISBN:08199377X]";
}


@Term
interface MononuclearCytotrophoblastCell extends TrophoblastCell {
	public static String id = "CL:0000523";
	public static String name = "mononuclear cytotrophoblast cell";
	public static String def = "";
}


@Term
interface Spheroplast extends Protoplast {
	public static String id = "CL:0000524";
	public static String name = "spheroplast";
	public static String def = "\"A cell, usually of bacteria or yeast, which has partially lost its cell wall.\" [MESH:A.11.868]";
}


@Term
interface SyncytiotrophoblastCell extends MultinucleateCell, TrophoblastCell {
	public static String id = "CL:0000525";
	public static String name = "syncytiotrophoblast cell";
	public static String def = "";
}


@Term
interface AfferentNeuron extends NeuronNeuralCrestDerived {
	public static String id = "CL:0000526";
	public static String name = "afferent neuron";
	public static String def = "\"A neuron which conveys sensory information centrally from the periphery.\" [MESH:A.08.663.650]";
}


@Term
interface EfferentNeuron extends NeuronNeuralCrestDerived {
	public static String id = "CL:0000527";
	public static String name = "efferent neuron";
	public static String def = "\"A neuron which sends impulses peripherally to activate muscles or secretory cells.\" [MESH:A.08.663.655]";
}


@Term
interface NitrergicNeuron extends AutonomicNeuron {
	public static String id = "CL:0000528";
	public static String name = "nitrergic neuron";
	public static String def = "\"A nerve cell where transmission is mediated by nitric oxide.\" [MESH:A.08.663.748]";
}


@Term
interface PigmentedEpithelialCell extends ColumnarCuboidalEpithelialCell {
	public static String id = "CL:0000529";
	public static String name = "pigmented epithelial cell";
	public static String def = "";

	@Relates("develops_from")
	public NeuroepithelialCell PigmentedEpithelialCell_develops_from();
}


@Term
interface PrimaryNeuron extends Neuron {
	public static String id = "CL:0000530";
	public static String name = "primary neuron";
	public static String def = "";
}


@Term
interface PrimarySensoryNeuron extends SensoryNeuron, PrimaryNeuron {
	public static String id = "CL:0000531";
	public static String name = "primary sensory neuron";
	public static String def = "";
}


@Term
interface CAPMotoneuron extends PrimaryMotorNeuron {
	public static String id = "CL:0000532";
	public static String name = "CAP motoneuron";
	public static String def = "";
}


@Term
interface PrimaryMotorNeuron extends MotorNeuron, PrimaryNeuron {
	public static String id = "CL:0000533";
	public static String name = "primary motor neuron";
	public static String def = "";
}


@Term
interface PrimaryInterneuron extends Interneuron, PrimaryNeuron {
	public static String id = "CL:0000534";
	public static String name = "primary interneuron";
	public static String def = "";
}


@Term
interface SecondaryNeuron extends Neuron {
	public static String id = "CL:0000535";
	public static String name = "secondary neuron";
	public static String def = "";
}


@Term
interface SecondaryMotorNeuron extends MotorNeuron, SecondaryNeuron {
	public static String id = "CL:0000536";
	public static String name = "secondary motor neuron";
	public static String def = "";
}


@Term
interface AntipodalCell extends GermLineCell, PlantCell {
	public static String id = "CL:0000537";
	public static String name = "antipodal cell";
	public static String def = "\"A cell located at the chalazal end of the mature embryo sac in angiosperms.\" [ISBN:047125208]";
}


@Term
interface EpidermalInitial extends NonTerminallyDifferentiatedCell, MeristematicCell {
	public static String id = "CL:0000538";
	public static String name = "epidermal initial";
	public static String def = "\"A relatively unspecialized cell that will give rise to specialized cell types of the epidermis.\" [TAIR:lr]";
}


@Term
interface Neuron extends ElectricallyResponsiveCell, ElectricallySignalingCell {
	public static String id = "CL:0000540";
	public static String name = "neuron";
	public static String def = "\"The basic cellular unit of nervous tissue. Each neuron consists of a body, an axon, and dendrites. Their purpose is to receive, conduct, and transmit impulses in the nervous system.\" [MESH:A.08.663]";

	@Relates("develops_from")
	public Neuroblast Neuron_develops_from();
}


@Term
interface Melanoblast extends NonTerminallyDifferentiatedCell {
	public static String id = "CL:0000541";
	public static String name = "melanoblast";
	public static String def = "\"A cell that originates from the neural crest and differentiates into a pigment cell.\" [SANBI:mhl]";

	@Relates("develops_from")
	public NeuralCrestCell Melanoblast_develops_from();
}


@Term
interface Lymphocyte extends Leukocyte {
	public static String id = "CL:0000542";
	public static String name = "lymphocyte";
	public static String def = "\"A cell of the B cell, T cell, or natural killer cell lineage.\" [GOC:add, ISBN:0781735149]";

	@Relates("develops_from")
	public CommonLymphoidProgenitor Lymphocyte_develops_from();
}


@Term
interface SieveTubeMember extends SieveElement {
	public static String id = "CL:0000543";
	public static String name = "sieve tube member";
	public static String def = "\"One of the series of cellular components of a sieve tube. It shows a more or less pronounced differentiation between sieve plates (wide pores) and lateral sieve areas (narrow pores). Also sieve tube element and the obsolete sieve tube segment.\" [ISBN:0471245208]";
}


@Term
interface SlowlyAdaptingMechanoreceptorCell extends MechanoreceptorCell {
	public static String id = "CL:0000544";
	public static String name = "slowly adapting mechanoreceptor cell";
	public static String def = "";
}


@Term
interface THelper1Cell extends CD4PositiveHelperTCell {
	public static String id = "CL:0000545";
	public static String name = "T-helper 1 cell";
	public static String def = "\"A CD4-positive, alpha-beta T cell that has the phenotype T-bet-positive and produces interferon-gamma.\" [GO_REF:0000031, GOC:add, GOC:pam]";

	@Relates("develops_from")
	public ActivatedCD4PositiveAlphaBetaTCell THelper1Cell_develops_from();
}


@Term
interface THelper2Cell extends CD4PositiveHelperTCell {
	public static String id = "CL:0000546";
	public static String name = "T-helper 2 cell";
	public static String def = "\"A CD4-positive, alpha-beta T cell that has the phenotype GATA-3-positive and produces interleukin-4.\" [GO_REF:0000031, GOC:add, GOC:pam]";

	@Relates("develops_from")
	public ActivatedCD4PositiveAlphaBetaTCell THelper2Cell_develops_from();
}


@Term
interface Proerythroblast extends ErythroidLineageCell {
	public static String id = "CL:0000547";
	public static String name = "proerythroblast";
	public static String def = "\"An immature, nucleated erythrocyte occupying the stage of erythropoeisis that follows formation of erythroid progenitor cells.\" [ISBN:0721601464, MESH:A.11.118.290.350.200]";

	@Relates("develops_from")
	public ErythroidProgenitorCell Proerythroblast_develops_from();
}


@Term
interface AnimalCell extends EukaryoticCell {
	public static String id = "CL:0000548";
	public static String name = "animal cell";
	public static String def = "";
}


@Term
interface BasophilicErythroblast extends Erythroblast {
	public static String id = "CL:0000549";
	public static String name = "basophilic erythroblast";
	public static String def = "\"A nucleated immature erythrocyte, having cytoplasm generally similar to that of the earlier proerythroblast but sometimes even more basophilic, and usually regular in outline. The nucleus is still relatively large, but the chromatin strands are thicker and more deeply staining, giving a coarser appearance; the nucleoli have disappeared.\" [ISBN:0721601464]";

	@Relates("develops_from")
	public Proerythroblast BasophilicErythroblast_develops_from();
}


@Term
interface PolychromatophilicErythroblast extends Erythroblast {
	public static String id = "CL:0000550";
	public static String name = "polychromatophilic erythroblast";
	public static String def = "\"A nucleated, immature erythrocyte in which the nucleus occupies a relatively smaller part of the cell than in its precursor, the basophilic erythroblast. The cytoplasm is beginning to acquire hemoglobin and thus is no longer a purely blue color, but takes on an acidophilic tint, which becomes progressively more marked as the cell matures. The chromatin of the nucleus is arranged in coarse, deeply staining clumps.\" [ISBN:0721601464]";

	@Relates("develops_from")
	public BasophilicErythroblast PolychromatophilicErythroblast_develops_from();
}


@Term
interface UnimodalNocireceptor extends PainReceptorCell {
	public static String id = "CL:0000551";
	public static String name = "unimodal nocireceptor";
	public static String def = "";
}


@Term
interface OrthochromaticErythroblast extends Erythroblast {
	public static String id = "CL:0000552";
	public static String name = "orthochromatic erythroblast";
	public static String def = "\"The final stage of the nucleated, immature erythrocyte, before nuclear loss. Typically the cytoplasm is described as acidophilic, but it still shows a faint polychromatic tint. The nucleus is small and initially may still have coarse, clumped chromatin, as in its precursor, the polychromatophilic erythroblast, but ultimately it becomes pyknotic, and appears as a deeply staining, blue-black, homogeneous structureless mass. The nucleus is often eccentric and sometimes lobulated.\" [ISBN:0721601464]";

	@Relates("develops_from")
	public PolychromatophilicErythroblast OrthochromaticErythroblast_develops_from();
}


@Term
interface MegakaryocyteProgenitorCell extends MyeloidProgenitorCell {
	public static String id = "CL:0000553";
	public static String name = "megakaryocyte progenitor cell";
	public static String def = "\"The earliest cytologically identifiable precursor in the thrombocytic series.\" [ISBN:0721601464]";

	@Relates("develops_from")
	public MegakaryocyteErythroidProgenitorCell MegakaryocyteProgenitorCell_develops_from();
}


@Term
interface GastrinStimulatingHormoneSecretingCell extends PeptideHormoneSecretingCell {
	public static String id = "CL:0000554";
	public static String name = "gastrin stimulating hormone secreting cell";
	public static String def = "";
}


@Term
interface BrushCell extends CNSNeuronSensuVertebrata {
	public static String id = "CL:0000555";
	public static String name = "brush cell";
	public static String def = "";
}


@Term
interface Megakaryocyte extends MyeloidCell {
	public static String id = "CL:0000556";
	public static String name = "megakaryocyte";
	public static String def = "\"A giant cell 50 to 100 micron in diameter, with a greatly lobulated nucleus, found in the bone marrow; mature blood platelets are released from its cytoplasm.\" [ISBN:0721601464]";

	@Relates("develops_from")
	public MegakaryocyteProgenitorCell Megakaryocyte_develops_from();
}


@Term
interface GranulocyteMonocyteProgenitorCell extends MyeloidProgenitorCell {
	public static String id = "CL:0000557";
	public static String name = "granulocyte monocyte progenitor cell";
	public static String def = "\"A progenitor cell that has plasma membrane part CD123, CD34, and CD45RA, lacks plasma membrane part CD19 and CD3, and is committed to the granulocyte and monocyte lineages.\" [GO_REF:0000031, GOC:add, GOC:amm, http://www.copewithcytokines.de, ISBN:0721601464, PMID:15684376, PMID:15867096, PMID:16551251]";

	@Relates("develops_from")
	public CD71PositiveCommonMyeloidProgenitor GranulocyteMonocyteProgenitorCell_develops_from();
}


@Term
interface Reticulocyte extends BloodCell, ErythroidLineageCell {
	public static String id = "CL:0000558";
	public static String name = "reticulocyte";
	public static String def = "\"An immature erythrocyte showing a basophilic reticulum under vital staining.\" [GOC:add, ISBN:0721601464]";

	@Relates("develops_from")
	public OrthochromaticErythroblast Reticulocyte_develops_from();
}


@Term
interface Promonocyte extends MyeloidProgenitorCell {
	public static String id = "CL:0000559";
	public static String name = "promonocyte";
	public static String def = "\"A precursor in the monocytic series, being a cell intermediate in development between the monoblast and monocyte.\" [http://www.clt.astate.edu/wwilliam/, ISBN:0721601464]";

	@Relates("develops_from")
	public Monoblast Promonocyte_develops_from();
}


@Term
interface BandFormNeutrophil extends ImmatureNeutrophil {
	public static String id = "CL:0000560";
	public static String name = "band form neutrophil";
	public static String def = "\"A late neutrophilic metamyelocyte in which the nucleus is in the form of a curved or coiled band, not having acquired the typical multilobar shape of the mature neutrophil.\" [GOC:add, ISBN:0721601464]";

	@Relates("develops_from")
	public NeutrophilicMetamyelocyte BandFormNeutrophil_develops_from();
}


@Term
interface AmacrineCell extends Interneuron {
	public static String id = "CL:0000561";
	public static String name = "amacrine cell";
	public static String def = "\"Interneuron of the vertebrate retina. They integrate, modulate, and interpose a temporal domain in the visual message presented to the retinal ganglion cells, with which they synapse in the inner plexiform layer.\" [MESH:A.08.663.358.050]";
}


@Term
interface NucleateErythrocyte extends Erythrocyte {
	public static String id = "CL:0000562";
	public static String name = "nucleate erythrocyte";
	public static String def = "\"An erythrocyte having a nucleus.\" [GOC:add]";
}


@Term
interface Endospore extends ProkaryoticCell {
	public static String id = "CL:0000563";
	public static String name = "endospore";
	public static String def = "";
}


@Term
interface NeutrophilicPromyelocyte extends Promyelocyte {
	public static String id = "CL:0000564";
	public static String name = "neutrophilic promyelocyte";
	public static String def = "\"A neutrophil precursor in the granulocytic series, being a cell intermediate in development between a myeloblast and myelocyte, and containing a few, as yet undifferentiated, cytoplasmic granules.\" [GOC:add, ISBN:0721601464]";

	@Relates("develops_from")
	public NeutrophilicMyeloblast NeutrophilicPromyelocyte_develops_from();
}


@Term
interface FatBodyCell extends MetabolisingCell, AnimalCell {
	public static String id = "CL:0000565";
	public static String name = "fat body cell";
	public static String def = "\"A cell whose primary function is intermediary metabolism.\" [FB:ma]";
}


@Term
interface AngioblasticMesenchymalCell extends MultiFateStemCell {
	public static String id = "CL:0000566";
	public static String name = "angioblastic mesenchymal cell";
	public static String def = "";

	@Relates("develops_from")
	public MesenchymalCell AngioblasticMesenchymalCell_develops_from();
}


@Term
interface PolymodalNocireceptor extends PainReceptorCell {
	public static String id = "CL:0000567";
	public static String name = "polymodal nocireceptor";
	public static String def = "";
}


@Term
interface ApudCell extends NeuroendocrineCell {
	public static String id = "CL:0000568";
	public static String name = "apud cell";
	public static String def = "\"A cell that develops from primitive cell types in the neural crest. During ontogeny they migrate to the foregut and specific locations of the neuroendocrine system. Properly located these cells form part of the normal hormone producing tissues of the neuroendocrine system. If misdirected these cells may become hyperplastic, adenomatous, or malignant.\" [MESH:A.11.070]";
}


@Term
interface CardiacMesenchymalCell extends MesenchymalCell {
	public static String id = "CL:0000569";
	public static String name = "cardiac mesenchymal cell";
	public static String def = "\"A mesenchymal cell found in the developing heart.\" [PMID:18816864]";

	@Relates("develops_from")
	public TrunkNeuralCrestCell CardiacMesenchymalCell_develops_from();
}


@Term
interface ParafollicularCell {
	public static String id = "CL:0000570";
	public static String name = "parafollicular cell";
	public static String def = "";

	@Relates("develops_from")
	public NeuralCrestCell ParafollicularCell_develops_from();
}


@Term
interface Leucophore extends PigmentCell {
	public static String id = "CL:0000571";
	public static String name = "leucophore";
	public static String def = "\"A pigment cell derived from the neural crest. Contains uric acid or other purine crystals deposited in stacks called leucosomes. The crystals reflect light and this gives a white appearance under white light.\" [SANBI:mhl]";

	@Relates("develops_from")
	public Leucoblast Leucophore_develops_from();
}


@Term
interface RetinalConeCell extends EyePhotoreceptorCell {
	public static String id = "CL:0000573";
	public static String name = "retinal cone cell";
	public static String def = "\"One of the two photoreceptor cell types in the vertebrate retina. In cones the photopigment is in invaginations of the cell membrane of the outer segment. Cones are less sensitive to light than rods, but they provide vision with higher spatial and temporal acuity, and the combination of signals from cones with different pigments allows color vision.\" [MESH:A.08.663.650.650.670.100]";
}


@Term
interface Erythrophore extends PigmentCell {
	public static String id = "CL:0000574";
	public static String name = "erythrophore";
	public static String def = "\"A pigment cell derived from the neural crest. Contains pteridine and/or carotenoid pigments in structures called pterinosomes or erythrosomes. This gives an orange to red appearance.\" [SANBI:mhl]";

	@Relates("develops_from")
	public PigmentErythroblast Erythrophore_develops_from();
}


@Term
interface CornealEpithelialCell extends SquamousEpithelialCell {
	public static String id = "CL:0000575";
	public static String name = "corneal epithelial cell";
	public static String def = "";
}


@Term
interface Monocyte extends MyeloidLeukocyte {
	public static String id = "CL:0000576";
	public static String name = "monocyte";
	public static String def = "\"Myeloid mononuclear recirculating leukocyte that can act as a precursor of tissue macrophages, osteoclasts and some populations of tissue dendritic cells.\" [GO_REF:0000031, http://www.clt.astate.edu/wwilliam/, MESH:A.11.118.637.555.652]";

	@Relates("develops_from")
	public Promonocyte Monocyte_develops_from();
}


@Term
interface EnterochromaffinLikeCell extends EnteroendocrineCell {
	public static String id = "CL:0000577";
	public static String name = "enterochromaffin like cell";
	public static String def = "\"One of a group of basal granular cells of the mammalian gut whose granules stain readily with silver and chromium salts. The cells secrete serotonin, substance P, and enkephalins. There are three types: gastric (antral mucosa), duodenal, and intestinal.\" [MESH:A.03.492.766.440.250]";
}


@Term
interface ExperimentallyModifiedCell extends Cell {
	public static String id = "CL:0000578";
	public static String name = "experimentally modified cell";
	public static String def = "\"A cell that has been changed as a consequence of a deliberate and specific experimental procedure.\" [FB:ma]";
}


@Term
interface BorderFollicleCell extends FollicleCell {
	public static String id = "CL:0000579";
	public static String name = "border follicle cell";
	public static String def = "";
}


@Term
interface NeutrophilicMyelocyte extends ImmatureNeutrophil {
	public static String id = "CL:0000580";
	public static String name = "neutrophilic myelocyte";
	public static String def = "\"A neutrophil precursor in the granulocytic series, being a cell intermediate in development between a promyelocyte and a metamyelocyte; in this stage, differentiation of cytoplasmic granules has begun.\" [GOC:add, ISBN:0721601464]";

	@Relates("develops_from")
	public NeutrophilicPromyelocyte NeutrophilicMyelocyte_develops_from();
}


@Term
interface PeritonealMacrophage extends TissueResidentMacrophage {
	public static String id = "CL:0000581";
	public static String name = "peritoneal macrophage";
	public static String def = "\"A macrophage resident in the peritoneum under non-inflammatory conditions.\" [MESH:A.11.329.372.630, PMID:15771589]";
}


@Term
interface NeutrophilicMetamyelocyte extends ImmatureNeutrophil {
	public static String id = "CL:0000582";
	public static String name = "neutrophilic metamyelocyte";
	public static String def = "\"A neutrophil precursor in the granulocytic series, being a cell intermediate in development between a meylocyte and the band form neutrophil. The protein synthesis seen in earlier stages decreases or stops; the nucleus becomes indented and its chromatin becomes coarse and clumped; and the cytoplasm becomes pink like that of a mature granulocyte.\" [GOC:add, ISBN:0721601464]";

	@Relates("develops_from")
	public NeutrophilicMyelocyte NeutrophilicMetamyelocyte_develops_from();
}


@Term
interface AlveolarMacrophage extends TissueResidentMacrophage {
	public static String id = "CL:0000583";
	public static String name = "alveolar macrophage";
	public static String def = "\"A tissue-resident macrophage found in the alveoli of the lungs. Ingests small inhaled particles resulting in degradation and presentation of the antigen to immunocompetent cells.\" [GO_REF:0000031, GOC:ana, MESH:A.11.329.372.600]";
}


@Term
interface Enterocyte extends BrushBorderEpithelialCell {
	public static String id = "CL:0000584";
	public static String name = "enterocyte";
	public static String def = "\"An epithelial cell that has its apical plasma membrane folded into microvilli to provide ample surface for the absorption of nutrients from the intestinal lumen.\" [SANBI:mhl]";
}


@Term
interface GermCell extends GermLineCell {
	public static String id = "CL:0000586";
	public static String name = "germ cell";
	public static String def = "\"The reproductive cell in multicellular organisms.\" [MESH:A.05.360.490]";
}


@Term
interface ColdSensingThermoreceptorCell extends ThermoreceptorCell {
	public static String id = "CL:0000587";
	public static String name = "cold sensing thermoreceptor cell";
	public static String def = "";
}


@Term
interface Odontoclast extends Osteoclast {
	public static String id = "CL:0000588";
	public static String name = "odontoclast";
	public static String def = "\"A specialized osteoclast associated with the absorption and removal of cementum.\" [GOC:add, MESH:A.11.329.679]";
}


@Term
interface InnerHairCell extends AuditoryHairCell {
	public static String id = "CL:0000589";
	public static String name = "inner hair cell";
	public static String def = "\"A bulbous cell that is medially placed in one row in the organ of Corti. In contrast to the outer hair cells, the inner hair cells are fewer in number, have fewer sensory hairs, and are less differentiated.\" [MESH:A.08.663.650.250.250]";
}


@Term
interface SmallLutealCell extends LutealCell, ProgesteroneSecretingCell {
	public static String id = "CL:0000590";
	public static String name = "small luteal cell";
	public static String def = "";

	@Relates("develops_from")
	public ThecaCell SmallLutealCell_develops_from();
}


@Term
interface WarmthSensingThermoreceptorCell extends ThermoreceptorCell {
	public static String id = "CL:0000591";
	public static String name = "warmth sensing thermoreceptor cell";
	public static String def = "";
}


@Term
interface LargeLutealCell extends LutealCell, TestosteroneSecretingCell {
	public static String id = "CL:0000592";
	public static String name = "large luteal cell";
	public static String def = "";

	@Relates("develops_from")
	public GranulosaCell LargeLutealCell_develops_from();
}


@Term
interface AndrogenSecretingCell extends SteroidHormoneSecretingCell {
	public static String id = "CL:0000593";
	public static String name = "androgen secreting cell";
	public static String def = "";
}


@Term
interface SkeletalMuscleSatelliteCell extends SkeletalMuscleMyoblast {
	public static String id = "CL:0000594";
	public static String name = "skeletal muscle satellite cell";
	public static String def = "\"An elongated, spindle-shaped, quiescent myoblast lying in close contact with adult skeletal muscle. They are thought to play a role in muscle repair and regeneration.\" [MESH:A.11.635.500.700]";
}


@Term
interface EnucleateErythrocyte extends AnucleateCell, Erythrocyte {
	public static String id = "CL:0000595";
	public static String name = "enucleate erythrocyte";
	public static String def = "\"An erythrocyte lacking a nucleus.\" [GOC:add]";
}


@Term
interface SexualSpore extends Spore {
	public static String id = "CL:0000596";
	public static String name = "sexual spore";
	public static String def = "";
}


@Term
interface Microconidium extends Conidium {
	public static String id = "CL:0000597";
	public static String name = "microconidium";
	public static String def = "";
}


@Term
interface PyramidalCell extends CNSNeuronSensuVertebrata {
	public static String id = "CL:0000598";
	public static String name = "pyramidal cell";
	public static String def = "\"A projection neuron in the cerebral cortex and the hippocampus. Pyramidal cells have a pyramid-shaped soma with the apex and an apical dendrite pointed toward the pial surface and other dendrites and an axon emerging from the base. The axons may have local collaterals but also project outside their cortical region.\" [MESH:A.08.186.211.577.405.700]";
}


@Term
interface Conidium extends AsexualSpore {
	public static String id = "CL:0000599";
	public static String name = "conidium";
	public static String def = "\"A non-motile asexual spore that has not developed by cytoplasmic cleavage (see: sporangiospore ; CL:0000616) or free-cell formation (see: ascospore ; CL:0000607).\" [ISBN:08199377X]";
}


@Term
interface Heterokaryon extends MultinucleateCell, FungalCell {
	public static String id = "CL:0000600";
	public static String name = "heterokaryon";
	public static String def = "\"A fungal cell with two or more genetically distinct nuclei.\" [ISBN:08199377X]";
}


@Term
interface OuterHairCell extends AuditoryHairCell {
	public static String id = "CL:0000601";
	public static String name = "outer hair cell";
	public static String def = "\"A mechanoreceptor in the organ of Corti. In mammals the outer hair cells are arranged in three rows which are further from the modiolus than the single row of inner hair cells. The motile properties of the outer hair cells may contribute actively to tuning the sensitivity and frequency selectivity of the cochlea.\" [MESH:A.08.663.650.250.315]";
}


@Term
interface PressoreceptorCell extends StretchReceptorCell {
	public static String id = "CL:0000602";
	public static String name = "pressoreceptor cell";
	public static String def = "\"A receptor in the vascular system, particularly the aorta and carotid sinus, which is sensitive to stretch of the vessel walls.\" [MESH:A.08.800.050.800.900.700]";
}


@Term
interface Dikaryon extends BinucleateCell, FungalCell, Heterokaryon {
	public static String id = "CL:0000603";
	public static String name = "dikaryon";
	public static String def = "\"A fungal cell with two genetically distinct haploid nuclei.\" [ISBN:08199377X]";
}


@Term
interface RetinalRodCell extends EyePhotoreceptorCell {
	public static String id = "CL:0000604";
	public static String name = "retinal rod cell";
	public static String def = "\"One of the two photoreceptor cell types of the vertebrate retina. In rods the photopigment is in stacks of membranous disks separate from the outer cell membrane. Rods are more sensitive to light than cones, but rod mediated vision has less spatial and temporal resolution than cone vision.\" [MESH:A.08.663.650.650.670.650]";
}


@Term
interface AsexualSpore extends Spore {
	public static String id = "CL:0000605";
	public static String name = "asexual spore";
	public static String def = "";
}


@Term
interface Macroconidium extends Conidium {
	public static String id = "CL:0000606";
	public static String name = "macroconidium";
	public static String def = "";
}


@Term
interface Ascospore extends SexualSpore {
	public static String id = "CL:0000607";
	public static String name = "ascospore";
	public static String def = "\"A sexual spore produced in an ascus by 'free cell formation'. Has a multilayered spore wall.\" [ISBN:08199377X]";
}


@Term
interface Zygospore extends Spore {
	public static String id = "CL:0000608";
	public static String name = "zygospore";
	public static String def = "\"A resting spore resulting from the conjugation of isogametes or from the fusion of like gametangia.\" [ISBN:08199377X]";
}


@Term
interface VestibularHairCell extends AuditoryHairCell {
	public static String id = "CL:0000609";
	public static String name = "vestibular hair cell";
	public static String def = "\"A mechanoreceptor located in the acoustic maculae and the semicircular canals that mediates the sense of balance, movement, and head position. The vestibular hair cells are connected to accessory structures in such a way that movements of the head displace their stereocilia. This influences the membrane potential of the cells which relay information about movements via the vestibular part of the vestibulocochlear nerve to the brain stem.\" [MESH:A.08.663.650.250.380]";
}


@Term
interface PlantCell extends EukaryoticCell {
	public static String id = "CL:0000610";
	public static String name = "plant cell";
	public static String def = "\"A cell found in seeded plants.\" [TAIR:syr]";
}


@Term
interface EosinophilProgenitorCell extends MyeloidProgenitorCell {
	public static String id = "CL:0000611";
	public static String name = "eosinophil progenitor cell";
	public static String def = "\"A progenitor cell committed to the eosinophil lineage.\" [http://www.copewithcytokines.de]";

	@Relates("develops_from")
	public GranulocyteMonocyteProgenitorCell EosinophilProgenitorCell_develops_from();
}


@Term
interface EosinophilicMyelocyte extends ImmatureEosinophil {
	public static String id = "CL:0000612";
	public static String name = "eosinophilic myelocyte";
	public static String def = "\"A eosinophil precursor in the granulocytic series, being a cell intermediate in development between a promyelocyte and a metamyelocyte; in this stage, differentiation of cytoplasmic granules has begun.\" [GOC:add, ISBN:0721601464]";

	@Relates("develops_from")
	public EosinophilicPromyelocyte EosinophilicMyelocyte_develops_from();
}


@Term
interface BasophilProgenitorCell extends MyeloidProgenitorCell {
	public static String id = "CL:0000613";
	public static String name = "basophil progenitor cell";
	public static String def = "\"A progenitor cell committed to the basophil lineage.\" [GOC:add, http://www.copewithcytokines.de]";

	@Relates("develops_from")
	public GranulocyteMonocyteProgenitorCell BasophilProgenitorCell_develops_from();
}


@Term
interface BasophilicMyelocyte extends ImmatureBasophil {
	public static String id = "CL:0000614";
	public static String name = "basophilic myelocyte";
	public static String def = "\"A basophil precursor in the granulocytic series, being a cell intermediate in development between a promyelocyte and a metamyelocyte; in this stage, differentiation of cytoplasmic granules has begun.\" [GOC:add, ISBN:0721601464]";

	@Relates("develops_from")
	public BasophilicPromyelocyte BasophilicMyelocyte_develops_from();
}


@Term
interface Basidiospore extends SexualSpore {
	public static String id = "CL:0000615";
	public static String name = "basidiospore";
	public static String def = "\"A spore containing one or two haploid nuclei produced, after meiosis, on a basidium.\" [ISBN:08199377X]";
}


@Term
interface Sporangiospore extends AsexualSpore {
	public static String id = "CL:0000616";
	public static String name = "sporangiospore";
	public static String def = "\"A walled spore produced in a sporangium.\" [ISBN:08199377X]";
}


@Term
interface GABAergicNeuron extends AutonomicNeuron {
	public static String id = "CL:0000617";
	public static String name = "GABAergic neuron";
	public static String def = "";
}


@Term
interface SheathCell extends ColumnarCuboidalEpithelialCell {
	public static String id = "CL:0000618";
	public static String name = "sheath cell";
	public static String def = "";
}


@Term
interface SupportCellSensuNematoda extends GlialCellSensuNematodaAndProtostomia, SupportCellSensuNematodaAndProtostomia {
	public static String id = "CL:0000619";
	public static String name = "support cell (sensu Nematoda)";
	public static String def = "";
}


@Term
interface Zoospore extends Sporangiospore {
	public static String id = "CL:0000620";
	public static String name = "zoospore";
	public static String def = "\"A sporangiospore that is motile, having flagella.\" [ISBN:08199377X]";
}


@Term
interface FusionCompetentMyoblast extends Myoblast {
	public static String id = "CL:0000621";
	public static String name = "fusion competent myoblast";
	public static String def = "";
}


@Term
interface AcinarCell extends ProteinSecretingCell {
	public static String id = "CL:0000622";
	public static String name = "acinar cell";
	public static String def = "";
}


@Term
interface NaturalKillerCell extends Lymphocyte {
	public static String id = "CL:0000623";
	public static String name = "natural killer cell";
	public static String def = "\"A lymphocyte that can spontaneously kill a variety of target cells without prior antigenic activation via germline encoded activation receptors and also regulate immune responses via cytokine release and direct contact with other cells.\" [GOC:add, ISBN:0781735149, PMID:15771571]";

	@Relates("develops_from")
	public ProNKCell NaturalKillerCell_develops_from();

	@Relates("develops_from")
	public DN1ThymicProTCell NaturalKillerCell_develops_from_1();
}


@Term
interface CD4PositiveAlphaBetaTCell extends MatureAlphaBetaTCell {
	public static String id = "CL:0000624";
	public static String name = "CD4-positive, alpha-beta T cell";
	public static String def = "\"A mature alpha-beta T cell that expresses an alpha-beta T cell receptor and the CD4 coreceptor.\" [GOC:add, ISBN:0781735149]";
}


@Term
interface CD8PositiveAlphaBetaTCell extends MatureAlphaBetaTCell {
	public static String id = "CL:0000625";
	public static String name = "CD8-positive, alpha-beta T cell";
	public static String def = "\"A T cell expressing an alpha-beta T cell receptor and the CD8 coreceptor.\" [GOC:add, ISBN:0781735149]";
}


@Term
interface OlfactoryGranuleCell extends GranuleCell {
	public static String id = "CL:0000626";
	public static String name = "olfactory granule cell";
	public static String def = "\"Granule cell that is part of the olfactory bulb.\" [GOC:mah]";
}


@Term
interface TransportingCell extends CellByFunction {
	public static String id = "CL:0000627";
	public static String name = "transporting cell";
	public static String def = "\"A cell involved in transporting nutrients, minerals, water, gases and other chemicals between cells for a variety of purposes including conveying nutrition to other tissues, removing waste products from the tissues, conveying gases for respiration, distributing heat and repelling invasion of foreign substances.\" [TAIR:sr]";
}


@Term
interface PhotosyntheticCell extends CellByFunction {
	public static String id = "CL:0000628";
	public static String name = "photosynthetic cell";
	public static String def = "\"A cell that can perform photosynthesis, in which carbohydrates are synthesized from carbon dioxide and water, using light as the energy source.\" [TAIR:sr]";
}


@Term
interface StorageCell extends StuffAccumulatingCell {
	public static String id = "CL:0000629";
	public static String name = "storage cell";
	public static String def = "\"A cell that is specialized to store a particular substance(s), which is(are) later released from the store for a particular purpose.\" [FB:ma]";
}


@Term
interface SupportiveCell extends CellByFunction {
	public static String id = "CL:0000630";
	public static String name = "supportive cell";
	public static String def = "\"A cell whose primary function is to support other cell types.\" [FB:ma]";
}


@Term
interface LabyrinthSupportingCell extends SupportiveCell {
	public static String id = "CL:0000631";
	public static String name = "labyrinth supporting cell";
	public static String def = "\"Cells forming a framework supporting the organ of Corti. Specific cells are those of Claudius, Deiters and Hensen.\" [MESH:A.09.246.631.246.577.543]";
}


@Term
interface ItoCell extends ExtracellularMatrixSecretingCell {
	public static String id = "CL:0000632";
	public static String name = "ito cell";
	public static String def = "";
}


@Term
interface HensenCell extends EpithelialCell, SupportiveCell {
	public static String id = "CL:0000633";
	public static String name = "Hensen cell";
	public static String def = "";
}


@Term
interface ClaudiusCell extends EpithelialCell, SupportiveCell {
	public static String id = "CL:0000634";
	public static String name = "Claudius cell";
	public static String def = "";
}


@Term
interface DeitersCell extends EpithelialCell, AuditoryEpithelialSupportCell {
	public static String id = "CL:0000635";
	public static String name = "Deiter's cell";
	public static String def = "";
}


@Term
interface MullerCell extends Astrocyte {
	public static String id = "CL:0000636";
	public static String name = "Muller cell";
	public static String def = "";
}


@Term
interface ChromophilCell extends EndocrineCell {
	public static String id = "CL:0000637";
	public static String name = "chromophil cell";
	public static String def = "";
}


@Term
interface AcidophilCell extends ChromophilCell {
	public static String id = "CL:0000638";
	public static String name = "acidophil cell";
	public static String def = "";
}


@Term
interface BasophilCellOfAnteriorLobeOfHypophysis extends ChromophilCell {
	public static String id = "CL:0000639";
	public static String name = "basophil cell of anterior lobe of hypophysis";
	public static String def = "";
}


@Term
interface ChromophobeCell extends EndocrineCell {
	public static String id = "CL:0000641";
	public static String name = "chromophobe cell";
	public static String def = "";
}


@Term
interface FolliculostellateCell extends EndocrineCell, SupportiveCell {
	public static String id = "CL:0000642";
	public static String name = "folliculostellate cell";
	public static String def = "\"A supportive cell of the vertebrate pituitary that provides macromolecular transport and secretes hormones.\" [JB:jb]";
}


@Term
interface Tanycyte extends Astrocyte {
	public static String id = "CL:0000643";
	public static String name = "tanycyte";
	public static String def = "";
}


@Term
interface BergmannGlialCell extends Astrocyte {
	public static String id = "CL:0000644";
	public static String name = "Bergmann glial cell";
	public static String def = "";
}


@Term
interface Pituicyte extends Astrocyte {
	public static String id = "CL:0000645";
	public static String name = "pituicyte";
	public static String def = "";
}


@Term
interface BasalCell extends EpithelialFateStemCell {
	public static String id = "CL:0000646";
	public static String name = "basal cell";
	public static String def = "";
}


@Term
interface MultinucleatedGiantCell extends MyeloidLeukocyte {
	public static String id = "CL:0000647";
	public static String name = "multinucleated giant cell";
	public static String def = "\"A phagocytic cell formed by the fusion of macrophages, occurs in chronic inflammatory responses to persistent microorganism such as M.tuberculosis, component of granulomas.\" [GOC:add, ISBN:0702022918, ISBN:0702024783]";

	@Relates("develops_from")
	public Macrophage MultinucleatedGiantCell_develops_from();
}


@Term
interface JuxtaglomerularCell extends SmoothMuscleCell {
	public static String id = "CL:0000648";
	public static String name = "juxtaglomerular cell";
	public static String def = "";
}


@Term
interface PrickleCell extends Keratinocyte {
	public static String id = "CL:0000649";
	public static String name = "prickle cell";
	public static String def = "";
}


@Term
interface MesangialCell {
	public static String id = "CL:0000650";
	public static String name = "mesangial cell";
	public static String def = "";

	@Relates("develops_from")
	public MesenchymalCell MesangialCell_develops_from();
}


@Term
interface NeckCell extends MucusSecretingCell {
	public static String id = "CL:0000651";
	public static String name = "neck cell";
	public static String def = "";
}


@Term
interface Pinealocyte extends EndocrineCell {
	public static String id = "CL:0000652";
	public static String name = "pinealocyte";
	public static String def = "";
}


@Term
interface Podocyte extends EpithelialCell {
	public static String id = "CL:0000653";
	public static String name = "podocyte";
	public static String def = "";
}


@Term
interface PrimaryOocyte extends Oocyte {
	public static String id = "CL:0000654";
	public static String name = "primary oocyte";
	public static String def = "";
}


@Term
interface SecondaryOocyte extends Oocyte {
	public static String id = "CL:0000655";
	public static String name = "secondary oocyte";
	public static String def = "";
}


@Term
interface PrimarySpermatocyte extends Spermatocyte {
	public static String id = "CL:0000656";
	public static String name = "primary spermatocyte";
	public static String def = "";
}


@Term
interface SecondarySpermatocyte extends Spermatocyte {
	public static String id = "CL:0000657";
	public static String name = "secondary spermatocyte";
	public static String def = "";
}


@Term
interface CuticleSecretingCell extends EpithelialCell, ExtracellularMatrixSecretingCell {
	public static String id = "CL:0000658";
	public static String name = "cuticle secreting cell";
	public static String def = "";
}


@Term
interface EggshellSecretingCell extends ExtracellularMatrixSecretingCell, FollicularEpithelialCell {
	public static String id = "CL:0000659";
	public static String name = "eggshell secreting cell";
	public static String def = "";
}


@Term
interface GlycocalyxSecretingCell extends ExtracellularMatrixSecretingCell {
	public static String id = "CL:0000660";
	public static String name = "glycocalyx secreting cell";
	public static String def = "";
}


@Term
interface DistalTipCellSensuNematoda extends MitogenicSignalingCell {
	public static String id = "CL:0000661";
	public static String name = "distal tip cell (sensu Nematoda)";
	public static String def = "";
}


@Term
interface NeuroglioblastSensuNematoda extends Neuroglioblast {
	public static String id = "CL:0000662";
	public static String name = "neuroglioblast (sensu Nematoda)";
	public static String def = "";
}


@Term
interface ValveCell extends CellByFunction {
	public static String id = "CL:0000663";
	public static String name = "valve cell";
	public static String def = "";
}


@Term
interface ClosableValveCell extends MyoepithelialCell, ValveCell {
	public static String id = "CL:0000664";
	public static String name = "closable valve cell";
	public static String def = "";
}


@Term
interface PermanentlyOpenValveCell extends ValveCell {
	public static String id = "CL:0000665";
	public static String name = "permanently open valve cell";
	public static String def = "";
}


@Term
interface FenestratedCell extends EpithelialCell {
	public static String id = "CL:0000666";
	public static String name = "fenestrated cell";
	public static String def = "";
}


@Term
interface CollagenSecretingCell extends ExtracellularMatrixSecretingCell {
	public static String id = "CL:0000667";
	public static String name = "collagen secreting cell";
	public static String def = "";
}


@Term
interface ParenchymalCell extends CellByHistology, PlantCell {
	public static String id = "CL:0000668";
	public static String name = "parenchymal cell";
	public static String def = "\"Typically this is a not distinctly specialized cell with a nucleate protoplast concerned with one or more of the various physiological and biochemical activities in plants. Varies in size, form, and wall structure.\" [ISBN:0471245208]";
}


@Term
interface AdventitialCell extends SupportiveCell {
	public static String id = "CL:0000669";
	public static String name = "adventitial cell";
	public static String def = "";
}


@Term
interface PrimordialGermCell extends GermLineCell, MotileCell {
	public static String id = "CL:0000670";
	public static String name = "primordial germ cell";
	public static String def = "";
}


@Term
interface CentripetallyMigratingFollicleCell extends FollicleCell {
	public static String id = "CL:0000671";
	public static String name = "centripetally migrating follicle cell";
	public static String def = "";
}


@Term
interface TrachearyElement extends PlantCell, TransportingCell {
	public static String id = "CL:0000672";
	public static String name = "tracheary element";
	public static String def = "\"A water conducting cell, tracheid or vessel member.\" [ISBN:0471245208]";
}


@Term
interface KenyonCell extends CNSNeuronSensuVertebrata {
	public static String id = "CL:0000673";
	public static String name = "Kenyon cell";
	public static String def = "";
}


@Term
interface InterfollicleCell extends ColumnarCuboidalEpithelialCell {
	public static String id = "CL:0000674";
	public static String name = "interfollicle cell";
	public static String def = "";
}


@Term
interface FemaleGamete extends Gamete {
	public static String id = "CL:0000675";
	public static String name = "female gamete";
	public static String def = "";
}


@Term
interface CapCell extends SupportCellSensuNematodaAndProtostomia {
	public static String id = "CL:0000676";
	public static String name = "cap cell";
	public static String def = "";
}


@Term
interface GutAbsorptiveCell extends AbsorptiveCell {
	public static String id = "CL:0000677";
	public static String name = "gut absorptive cell";
	public static String def = "\"Cell of the intestinal epithelium with a brush border made up of many parallel packed microvilli; associated with absorption, particularly of macromolecules.\" [JB:jb]";
}


@Term
interface CommisuralNeuron extends TormogenCell {
	public static String id = "CL:0000678";
	public static String name = "commisural neuron";
	public static String def = "";
}


@Term
interface GlutamatergicNeuron extends AutonomicNeuron {
	public static String id = "CL:0000679";
	public static String name = "glutamatergic neuron";
	public static String def = "";
}


@Term
interface MusclePrecursorCell {
	public static String id = "CL:0000680";
	public static String name = "muscle precursor cell";
	public static String def = "";

	@Relates("develops_from")
	public MesodermalCell MusclePrecursorCell_develops_from();
}


@Term
interface RadialGlialCell extends NeuroblastSensuVertebrata {
	public static String id = "CL:0000681";
	public static String name = "radial glial cell";
	public static String def = "\"A transient cell present only in the developing CNS. Functions as both a precursor cell and as a scaffold to support neuronal migration.\" [GOC:dph]";

	@Relates("develops_from")
	public NeuroepithelialCell RadialGlialCell_develops_from();
}


@Term
interface MCell extends EpithelialCell, DefensiveCell, TransportingCell {
	public static String id = "CL:0000682";
	public static String name = "M cell";
	public static String def = "\"An absorptive cell of the gut epithelium that endocytoses microorganisms and intact macromolecules from the gut lumen and transports them to the subepithelial space where they are presented to antigen-presenting cells and lymphocytes.\" [JB:jb]";
}


@Term
interface EpendymoglialCell extends Astrocyte {
	public static String id = "CL:0000683";
	public static String name = "ependymoglial cell";
	public static String def = "\"A cell that transports hormones from neurosecretory cells.\" [JB:jb]";
}


@Term
interface LittoralCellOfLiver extends MesothelialCell {
	public static String id = "CL:0000684";
	public static String name = "littoral cell of liver";
	public static String def = "";
}


@Term
interface MeristematicCell extends PlantCell, SomaticStemCell {
	public static String id = "CL:0000685";
	public static String name = "meristematic cell";
	public static String def = "\"A cell synthesizing protoplasm and producing new cells by division and with only a primary cell wall.\" [PO:0004010]";
}


@Term
interface CerebrospinalFluidSecretingCell extends ColumnarCuboidalEpithelialCell, SecretoryCell {
	public static String id = "CL:0000686";
	public static String name = "cerebrospinal fluid secreting cell";
	public static String def = "";

	@Relates("develops_from")
	public NeuralCrestCell CerebrospinalFluidSecretingCell_develops_from();
}


@Term
interface R1PhotoreceptorCell extends EyePhotoreceptorCell, VisibleLightPhotoreceptorCell {
	public static String id = "CL:0000687";
	public static String name = "R1 photoreceptor cell";
	public static String def = "";
}


@Term
interface PerijunctionalFibroblast extends Fibroblast, SupportiveCell {
	public static String id = "CL:0000688";
	public static String name = "perijunctional fibroblast";
	public static String def = "\"A fibroblast-like cell that provides support at neuromuscular junctions in vertebrates and are localized outside the synaptic basal lamina.\" [JB:jb]";
}


@Term
interface MyoendocrineCell extends EndocrineCell {
	public static String id = "CL:0000689";
	public static String name = "myoendocrine cell";
	public static String def = "\"A cell with both myofibrils and secretory granules.\" [JB:jb]";
}


@Term
interface R2PhotoreceptorCell extends EyePhotoreceptorCell, VisibleLightPhotoreceptorCell {
	public static String id = "CL:0000690";
	public static String name = "R2 photoreceptor cell";
	public static String def = "";
}


@Term
interface StellateInterneuron extends Interneuron {
	public static String id = "CL:0000691";
	public static String name = "stellate interneuron";
	public static String def = "";
}


@Term
interface TerminalSchwannCell extends SupportiveCell {
	public static String id = "CL:0000692";
	public static String name = "terminal Schwann cell";
	public static String def = "\"A neuroglial cell of the peripheral nervous system inside the basal lamina of the neuromuscular junction providing chemical and physical support to the synapse.\" [JB:jb]";

	@Relates("develops_from")
	public GlialCell TerminalSchwannCell_develops_from();
}


@Term
interface NeuroglioformCell extends StellateInterneuron {
	public static String id = "CL:0000693";
	public static String name = "neuroglioform cell";
	public static String def = "\"A stellate interneuron having 7-10 dendrites that may branch.\" [JB:jb]";
}


@Term
interface R3PhotoreceptorCell extends EyePhotoreceptorCell, VisibleLightPhotoreceptorCell {
	public static String id = "CL:0000694";
	public static String name = "R3 photoreceptor cell";
	public static String def = "";
}


@Term
interface CajalRetziusCell extends CNSNeuronSensuVertebrata {
	public static String id = "CL:0000695";
	public static String name = "Cajal-Retzius cell";
	public static String def = "\"One of a transient population of pioneering neurons in the cerebral cortex. These cells are slender bipolar cells of the developing marginal zone. One feature of these cells in mammals is that they express the Reelin gene.\" [PMID:10600995, PMID:9728912]";
}


@Term
interface PpCell extends StuffAccumulatingCell {
	public static String id = "CL:0000696";
	public static String name = "pp cell";
	public static String def = "\"A cell that stores pancreatic polypeptides.\" [JB:jb]";
}


@Term
interface R4PhotoreceptorCell extends EyePhotoreceptorCell, VisibleLightPhotoreceptorCell {
	public static String id = "CL:0000697";
	public static String name = "R4 photoreceptor cell";
	public static String def = "";
}


@Term
interface ParaganglialType1Cell extends NeuroendocrineCell {
	public static String id = "CL:0000699";
	public static String name = "paraganglial type 1 cell";
	public static String def = "";
}


@Term
interface DopaminergicNeuron extends AutonomicNeuron {
	public static String id = "CL:0000700";
	public static String name = "dopaminergic neuron";
	public static String def = "\"A neuron that releases dopamine as a neurotransmitter.\" [CL:dhill]";
}


@Term
interface ParagangliaType2Cell extends SupportiveCell {
	public static String id = "CL:0000701";
	public static String name = "paraganglia type 2 cell";
	public static String def = "\"Supports paraganglial type 1 cell.\" [JB:jb]";
}


@Term
interface R5PhotoreceptorCell extends EyePhotoreceptorCell, VisibleLightPhotoreceptorCell {
	public static String id = "CL:0000702";
	public static String name = "R5 photoreceptor cell";
	public static String def = "";
}


@Term
interface SustentacularCell extends SupportiveCell {
	public static String id = "CL:0000703";
	public static String name = "sustentacular cell";
	public static String def = "\"Cell that provides some or all mechanical, nutritional and phagocytic support to their neighbors.\" [JB:jb]";
}


@Term
interface EndothelialTipCell extends BloodVesselEndothelialCell {
	public static String id = "CL:0000704";
	public static String name = "endothelial tip cell";
	public static String def = "\"A specialized endothelial cell that senses extracellular signals and guides the directed growth of blood vessels.\" [PMID:15376331]";
}


@Term
interface R6PhotoreceptorCell extends EyePhotoreceptorCell, VisibleLightPhotoreceptorCell {
	public static String id = "CL:0000705";
	public static String name = "R6 photoreceptor cell";
	public static String def = "";
}


@Term
interface ChoroidPlexusEpithelialCell extends EpendymalCell, TransportingCell {
	public static String id = "CL:0000706";
	public static String name = "choroid plexus epithelial cell";
	public static String def = "\"Specialized ependymal cell that produces the cerebrospinal fluid from the blood and secretes it into the lumen of the brain and spinal chord.\" [GOC:add, JB:jb, PMID:9550134]";
}


@Term
interface R7PhotoreceptorCell extends EyePhotoreceptorCell, UVSensitivePhotoreceptorCell {
	public static String id = "CL:0000707";
	public static String name = "R7 photoreceptor cell";
	public static String def = "";
}


@Term
interface LeptomeningealCell extends ExtracellularMatrixSecretingCell {
	public static String id = "CL:0000708";
	public static String name = "leptomeningeal  cell";
	public static String def = "\"Stromal cell that forms the internal covering of the vertebrate brain and produces ECM for this and the choroid plexus.\" [JB:jb]";
}


@Term
interface R8PhotoreceptorCell extends EyePhotoreceptorCell, VisibleLightPhotoreceptorCell {
	public static String id = "CL:0000709";
	public static String name = "R8 photoreceptor cell";
	public static String def = "";
}


@Term
interface NeuroepithelialCell {
	public static String id = "CL:0000710";
	public static String name = "neuroepithelial cell";
	public static String def = "";

	@Relates("develops_from")
	public NeurectodermalCell NeuroepithelialCell_develops_from();
}


@Term
interface CumulusCell extends ProteinSecretingCell {
	public static String id = "CL:0000711";
	public static String name = "cumulus cell";
	public static String def = "";

	@Relates("develops_from")
	public GranulosaCell CumulusCell_develops_from();
}


@Term
interface StratumGranulosumCell extends EpidermalCell {
	public static String id = "CL:0000712";
	public static String name = "stratum granulosum cell";
	public static String def = "";
}


@Term
interface CoronaRadiataCell extends CumulusCell {
	public static String id = "CL:0000713";
	public static String name = "corona radiata cell";
	public static String def = "";
}


@Term
interface EmbryonicCrystalCell extends CrystalCell, EmbryonicGlandHemocyte {
	public static String id = "CL:0000715";
	public static String name = "embryonic crystal cell";
	public static String def = "";
}


@Term
interface LymphGlandCrystalCell extends CrystalCell, LymphGlandHemocyte {
	public static String id = "CL:0000716";
	public static String name = "lymph gland crystal cell";
	public static String def = "";
}


@Term
interface FusimotorNeuron extends MotorNeuron {
	public static String id = "CL:0000717";
	public static String name = "fusimotor neuron";
	public static String def = "\"A subset of motor neurons that innervates intrafusal muscle fibers and has small diameter axons.\" [PMID:15582775]";
}


@Term
interface ConeCellSensuEndopterygota extends CrystallinAccumulatingCell {
	public static String id = "CL:0000718";
	public static String name = "cone cell (sensu Endopterygota)";
	public static String def = "";
}


@Term
interface PosteriorConeCellSensuEndopterygota extends ConeCellSensuEndopterygota {
	public static String id = "CL:0000719";
	public static String name = "posterior cone cell (sensu Endopterygota)";
	public static String def = "";
}


@Term
interface AnteriorConeCellSensuEndopterygota extends ConeCellSensuEndopterygota {
	public static String id = "CL:0000720";
	public static String name = "anterior cone cell (sensu Endopterygota)";
	public static String def = "";
}


@Term
interface EquatorialConeCellSensuEndopterygota extends ConeCellSensuEndopterygota {
	public static String id = "CL:0000721";
	public static String name = "equatorial cone cell (sensu Endopterygota)";
	public static String def = "";
}


@Term
interface Cystoblast extends AnimalCell, GermCell {
	public static String id = "CL:0000722";
	public static String name = "cystoblast";
	public static String def = "";
}


@Term
interface SomaticStemCell extends StemCell, AnimalCell {
	public static String id = "CL:0000723";
	public static String name = "somatic stem cell";
	public static String def = "\"A stem cell that can give rise to cell types of the body other than those of the germ-line.\" [GO:0048103]";
}


@Term
interface Heterocyst extends ProkaryoticCell, NitrogenFixingCell {
	public static String id = "CL:0000724";
	public static String name = "heterocyst";
	public static String def = "\" A differentiated cell that functions as a site of nitrogen fixation under aerobic conditions.\" [MA:ma]";
}


@Term
interface NitrogenFixingCell extends CellByFunction {
	public static String id = "CL:0000725";
	public static String name = "nitrogen fixing cell";
	public static String def = "";
}


@Term
interface Chlamydospore extends AsexualSpore {
	public static String id = "CL:0000726";
	public static String name = "chlamydospore";
	public static String def = "\"An asexual 1-celled spore (primarily for perennation, not dissemination). Originates endogenously and singly within part of a pre-existing cell by the contraction of the protoplast. Possesses an inner secondary and often thickened hyaline or brown wall, usually impregnated with hydrophobic material.\" [ISBN:085199377X]";
}


@Term
interface PrimaryPigmentCell extends VisualPigmentCellSensuNematodaAndProtostomia {
	public static String id = "CL:0000727";
	public static String name = "primary pigment cell";
	public static String def = "";
}


@Term
interface SecondaryPigmentCell extends VisualPigmentCellSensuNematodaAndProtostomia {
	public static String id = "CL:0000728";
	public static String name = "secondary pigment cell";
	public static String def = "";
}


@Term
interface TertiaryPigmentCell extends VisualPigmentCellSensuNematodaAndProtostomia {
	public static String id = "CL:0000729";
	public static String name = "tertiary pigment cell";
	public static String def = "";
}


@Term
interface LeadingEdgeCell extends EpithelialCell, AnimalCell {
	public static String id = "CL:0000730";
	public static String name = "leading edge cell";
	public static String def = "\"A cell at the front of a migrating epithelial sheet.\" [MA:ma]";
}


@Term
interface UrothelialCell extends EpithelialCell, AnimalCell {
	public static String id = "CL:0000731";
	public static String name = "urothelial cell";
	public static String def = "\"A cell of a layer of transitional epithelium in the wall of the bladder, ureter, and renal pelvis, external to the lamina propria.\" [MA:ma]";
}


@Term
interface AmoeboidCell extends MotileCell {
	public static String id = "CL:0000732";
	public static String name = "amoeboid cell";
	public static String def = "";
}


@Term
interface LymphGlandPlasmatocyte extends Plasmatocyte, LymphGlandHemocyte {
	public static String id = "CL:0000733";
	public static String name = "lymph gland plasmatocyte";
	public static String def = "";
}


@Term
interface EmbryonicGlandPlasmatocyte extends Plasmatocyte, EmbryonicGlandHemocyte {
	public static String id = "CL:0000734";
	public static String name = "embryonic gland plasmatocyte";
	public static String def = "";
}


@Term
interface LymphGlandHemocyte extends HemocyteSensuNematodaAndProtostomia {
	public static String id = "CL:0000735";
	public static String name = "lymph gland hemocyte";
	public static String def = "";
}


@Term
interface EmbryonicGlandHemocyte extends HemocyteSensuNematodaAndProtostomia {
	public static String id = "CL:0000736";
	public static String name = "embryonic gland hemocyte";
	public static String def = "";
}


@Term
interface StriatedMuscleCell extends MuscleCell {
	public static String id = "CL:0000737";
	public static String name = "striated muscle cell";
	public static String def = "";
}


@Term
interface Leukocyte extends HematopoieticCell {
	public static String id = "CL:0000738";
	public static String name = "leukocyte";
	public static String def = "\"A nucleated cell of the myeloid or lymphoid lineages, found in blood or other tissue.\" [GOC:add]";

	@Relates("develops_from")
	public HematopoieticStemCell Leukocyte_develops_from();
}


@Term
interface RetinalGanglionCell extends CNSNeuronSensuVertebrata {
	public static String id = "CL:0000740";
	public static String name = "retinal ganglion cell";
	public static String def = "\"The set of neurons that receives neural inputs via bipolar, horizontal and amacrine cells. The axons of these cells make up the optic nerve.\" [CL:dph]";
}


@Term
interface SpinalAccessoryMotorNeuron extends MotorNeuron {
	public static String id = "CL:0000741";
	public static String name = "spinal accessory motor neuron";
	public static String def = "\"A motor neuron that is located in the cervical region of the spinal cord and selectively innervates the sternocleidmastoid or trapezius muscle. Unlike other motor neurons, they extend axons dorsally along lateral margins of the spinal cord.\" [PMID:16267219]";
}


@Term
interface PeriarticularChondrocyte extends Chondrocyte {
	public static String id = "CL:0000742";
	public static String name = "periarticular chondrocyte";
	public static String def = "\"A round chondrocyte that first differentiates in the late embryonic growth plate of bone.\" [PMID:15951842]";
}


@Term
interface HypertrophicChondrocyte extends Chondrocyte {
	public static String id = "CL:0000743";
	public static String name = "hypertrophic chondrocyte";
	public static String def = "\"A terminally differentiated chondrocyte that differentiates in the late embryonic growth plate of bone.\" [PMID:15951842]";
}


@Term
interface ColumnarChondrocyte extends Chondrocyte {
	public static String id = "CL:0000744";
	public static String name = "columnar chondrocyte";
	public static String def = "\"A columnar chondrocyte that differentiates in the late embryonic growth plate of bone. Columnar chondrocytes vigorously proliferate and form columns in the growth plate.\" [PMID:15951842]";
}


@Term
interface HorizontalCell extends Interneuron {
	public static String id = "CL:0000745";
	public static String name = "horizontal cell";
	public static String def = "\"A neuron that laterally connects other neurons in the inner nuclear layer of the retina.\" [ISBN:0195088433]";
}


@Term
interface CardiacMuscleCell extends MuscleCell {
	public static String id = "CL:0000746";
	public static String name = "cardiac muscle cell";
	public static String def = "";
}


@Term
interface Cyanophore extends PigmentCell {
	public static String id = "CL:0000747";
	public static String name = "cyanophore";
	public static String def = "\"A pigment cell derived from the neural crest. Contains blue pigment of unknown chemical composition in fibrous organelles termed cyanosomes. This gives a blue appearance.\" [SANBI:mhl]";

	@Relates("develops_from")
	public Cyanoblast Cyanophore_develops_from();
}


@Term
interface RetinalBipolarNeuron extends BipolarNeuron {
	public static String id = "CL:0000748";
	public static String name = "retinal bipolar neuron";
	public static String def = "\"A bipolar neuron found in the retina and having connections with photoreceptors cells and neurons in the inner plexiform layer.\" [PMID:14689473]";
}


@Term
interface ONBipolarCell extends RetinalBipolarNeuron {
	public static String id = "CL:0000749";
	public static String name = "ON-bipolar cell";
	public static String def = "\"A bipolar neuron found in the retina and having connections with photoreceptors cells and neurons in the inner half of the inner plexiform layer. These cells depolarize in response to light stimulation of their corresponding photoreceptors.\" [PMID:14689473]";
}


@Term
interface OFFBipolarCell extends RetinalBipolarNeuron {
	public static String id = "CL:0000750";
	public static String name = "OFF-bipolar cell";
	public static String def = "\"A bipolar neuron found in the retina and having connections with photoreceptors cells and neurons in the outer half of the inner plexiform layer. These cells hyperpolarize in response to light stimulation of their corresponding photoreceptors.\" [PMID:14689473]";
}


@Term
interface RodBipolarCell extends RetinalBipolarNeuron, ONBipolarCell {
	public static String id = "CL:0000751";
	public static String name = "rod bipolar cell";
	public static String def = "\"A bipolar neuron found in the retina and having connections with rod photoreceptor cells and neurons in the inner plexiform layer.\" [PMID:14689473]";
}


@Term
interface ConeRetinalBipolarCell extends RetinalBipolarNeuron {
	public static String id = "CL:0000752";
	public static String name = "cone retinal bipolar cell";
	public static String def = "\"A bipolar neuron found in the retina and having connections with cone photoreceptor cells and neurons in the inner plexiform layer.\" [PMID:14689473]";
}


@Term
interface Type1ConeBipolarCellSensuMus extends OFFBipolarCell, ConeRetinalBipolarCell {
	public static String id = "CL:0000753";
	public static String name = "type 1 cone bipolar cell (sensu Mus)";
	public static String def = "\"An OFF-bipolar neuron found in the retina and having connections with cone photoreceptors cells and neurons in the outer half of the inner plexiform layer. The cell body of these cells is in the middle of the inner plexiform layer. The dendritic tree is stout and the axon terminates in sublamina 1. The axonal terminal is wide and has only a few varicosities.\" [PMID:14689473]";
}


@Term
interface Type2ConeBipolarCellSensuMus extends OFFBipolarCell, ConeRetinalBipolarCell {
	public static String id = "CL:0000754";
	public static String name = "type 2 cone bipolar cell (sensu Mus)";
	public static String def = "\"An OFF-bipolar neuron found in the retina and having connections with cone photoreceptors cells and neurons in the outer half of the inner plexiform layer. The dendritic tree is not well filled and the dendrites are more delicate than in type 1 cells. The axon terminal is bushier and exhibits a dense plexus of varicosities in the inner part of sublamina 1.\" [PMID:14689473]";
}


@Term
interface Type3ConeBipolarCellSensuMus extends OFFBipolarCell, ConeRetinalBipolarCell {
	public static String id = "CL:0000755";
	public static String name = "type 3 cone bipolar cell (sensu Mus)";
	public static String def = "\"An OFF-bipolar neuron found in the retina and having connections with cone photoreceptors cells and neurons in the outer half of the inner plexiform layer. The dendritic tree is delicate and the dendritic tips appear small when compared with type 1 cells. The axon terminal is stratified and restricted to sublamina 2 of the inner plexiform layer.\" [PMID:14689473]";
}


@Term
interface Type4ConeBipolarCellSensuMus extends OFFBipolarCell, ConeRetinalBipolarCell {
	public static String id = "CL:0000756";
	public static String name = "type 4 cone bipolar cell (sensu Mus)";
	public static String def = "\"An OFF-bipolar neuron found in the retina and having connections with cone photoreceptors cells and neurons in the outer half of the inner plexiform layer. The cell has a diffuse axon terminal with varicosities in sublaminae 1 and 2 of the inner plexiform layer.\" [PMID:14689473]";
}


@Term
interface Type5ConeBipolarCellSensuMus extends ONBipolarCell, ConeRetinalBipolarCell {
	public static String id = "CL:0000757";
	public static String name = "type 5 cone bipolar cell (sensu Mus)";
	public static String def = "\"An ON-bipolar neuron found in the retina and having connections with cone photoreceptors cells and neurons in the inner half of the inner plexiform layer. The axon terminal is restricted to sublamina 3 of the inner plexiform layer. It is narrowly stratified and branched. The dendritic tree has many delicate branches.\" [PMID:14689473]";
}


@Term
interface Type6ConeBipolarCellSensuMus extends ONBipolarCell, ConeRetinalBipolarCell {
	public static String id = "CL:0000758";
	public static String name = "type 6 cone bipolar cell (sensu Mus)";
	public static String def = "\"An ON-bipolar neuron found in the retina and having connections with cone photoreceptors cells and neurons in the inner half of the inner plexiform layer. The cell has a loose, delicate axon terminal that opens in sublamina 3 of the inner plexiform layer and descends into sublamina 4.\" [PMID:14689473]";
}


@Term
interface Type7ConeBipolarCellSensuMus extends ONBipolarCell, ConeRetinalBipolarCell {
	public static String id = "CL:0000759";
	public static String name = "type 7 cone bipolar cell (sensu Mus)";
	public static String def = "\"An ON-bipolar neuron found in the retina and having connections with cone photoreceptors cells and neurons in the inner half of the inner plexiform layer. The axon terminal is narrowly stratified and are found just below a calretinin-expressing band in sublamina 4 of the inner plexiform layer.\" [PMID:14689473]";
}


@Term
interface Type8ConeBipolarCellSensuMus extends ONBipolarCell, ConeRetinalBipolarCell {
	public static String id = "CL:0000760";
	public static String name = "type 8 cone bipolar cell (sensu Mus)";
	public static String def = "\"An ON-bipolar neuron found in the retina and having connections with cone photoreceptors cells and neurons in the inner half of the inner plexiform layer. This cell has the widest dendritic field and the widest axon terminal of all retinal bipolar cells. The axon terminal is delicate and stratified through sublaminae 4 and 5 of the inner plexiform layer.\" [PMID:14689473]";
}


@Term
interface Type9ConeBipolarCellSensuMus extends ONBipolarCell, ConeRetinalBipolarCell {
	public static String id = "CL:0000761";
	public static String name = "type 9 cone bipolar cell (sensu Mus)";
	public static String def = "\"An ON-bipolar neuron found in the retina and having connections with cone photoreceptors cells and neurons in the inner half of the inner plexiform layer. The dendritic tree is wide and the dendritic convergence indicates cone selectivity. The axon terminal is sparsely branched and terminates in sublamina 5 of the inner plexiform layer.\" [PMID:14689473]";
}


@Term
interface Thrombocyte extends BloodCell, MyeloidCell {
	public static String id = "CL:0000762";
	public static String name = "thrombocyte";
	public static String def = "\"A nucleated blood cell involved in coagulation, typically seen in birds and other non-mammalian vertebrates.\" [GOC:add]";

	@Relates("develops_from")
	public Thromboblast Thrombocyte_develops_from();
}


@Term
interface MyeloidCell extends HematopoieticCell {
	public static String id = "CL:0000763";
	public static String name = "myeloid cell";
	public static String def = "\"A cell of the monocyte, granulocyte, mast cell, megakaryocyte, or erythroid lineage.\" [GOC:add]";
}


@Term
interface ErythroidLineageCell extends MyeloidCell {
	public static String id = "CL:0000764";
	public static String name = "erythroid lineage cell";
	public static String def = "\"A immature or mature cell in the lineage leading to and including erythrocytes.\" [GOC:add]";
}


@Term
interface Erythroblast extends ErythroidLineageCell {
	public static String id = "CL:0000765";
	public static String name = "erythroblast";
	public static String def = "\"A nucleated precursor of an erythrocyte.\" [GOC:add, ISBN:0721601464]";
}


@Term
interface MyeloidLeukocyte extends Leukocyte {
	public static String id = "CL:0000766";
	public static String name = "myeloid leukocyte";
	public static String def = "\"A cell of the monocyte, granulocyte, or mast cell lineage.\" [GOC:add]";
}


@Term
interface Basophil extends Granulocyte {
	public static String id = "CL:0000767";
	public static String name = "basophil";
	public static String def = "\"Any of the immature or mature forms of a granular leukocyte that in its mature form has an irregularly shaped, pale-staining nucleus that is partially constricted into two lobes, and with cytoplasm that contains coarse, bluish-black granules of variable size. Basophils contain vasoactive amines such as histamine and serotonin, which are released on appropriate stimulation.\" [GOC:add, ISBN:0721601464]";
}


@Term
interface ImmatureBasophil extends Basophil {
	public static String id = "CL:0000768";
	public static String name = "immature basophil";
	public static String def = "\"Any of the immature forms of a basophil, in which basophilic specific granules are present but other phenotypic features of the mature form may be lacking. A basophil is granular leukocyte that in its mature form has an irregularly shaped, pale-staining nucleus that is partially constricted into two lobes, and with cytoplasm that contains coarse, bluish-black granules of variable size. Basophils contain vasoactive amines such as histamine and serotonin, which are released on appropriate stimulation.\" [GOC:add, ISBN:0721601464]";

	@Relates("develops_from")
	public BasophilicPromyelocyte ImmatureBasophil_develops_from();
}


@Term
interface BasophilicMetamyelocyte extends ImmatureBasophil {
	public static String id = "CL:0000769";
	public static String name = "basophilic metamyelocyte";
	public static String def = "\"A basophil precursor in the granulocytic series, being a cell intermediate in development between a basophilic myelocyte and a band form basophil.\" [ISBN:0721601464]";

	@Relates("develops_from")
	public BasophilicMyelocyte BasophilicMetamyelocyte_develops_from();
}


@Term
interface BandFormBasophil extends ImmatureBasophil {
	public static String id = "CL:0000770";
	public static String name = "band form basophil";
	public static String def = "\"A late basophilic metamyelocyte in which the nucleus is in the form of a curved or coiled band, not having acquired the typical multilobar shape of the mature basophil.\" [GOC:add, ISBN:0721601464]";

	@Relates("develops_from")
	public BasophilicMetamyelocyte BandFormBasophil_develops_from();
}


@Term
interface Eosinophil extends Granulocyte {
	public static String id = "CL:0000771";
	public static String name = "eosinophil";
	public static String def = "\"Any of the immature or mature forms of a granular leukocyte with a nucleus that usually has two lobes connected by one or more slender threads of chromatin, and cytoplasm containing coarse, round granules that are uniform in size and which can be stained by the dye eosin.\" [GOC:add, ISBN:0721601464]";
}


@Term
interface ImmatureEosinophil extends Eosinophil {
	public static String id = "CL:0000772";
	public static String name = "immature eosinophil";
	public static String def = "\"Any of the immature forms of an eosinophil, in which eosinophilic specific granules are present but other phenotypic features of the mature form may be lacking. An eosinophil is a granulocyte that in its mature form has a nucleus that usually has two lobes connected by one or more slender threads of chromatin, and cytoplasm containing coarse, round granules that are uniform in size and which can be stained by the dye eosin.\" [GOC:add, ISBN:0721601464]";

	@Relates("develops_from")
	public EosinophilicPromyelocyte ImmatureEosinophil_develops_from();
}


@Term
interface EosinophilicMetamyelocyte extends ImmatureEosinophil {
	public static String id = "CL:0000773";
	public static String name = "eosinophilic metamyelocyte";
	public static String def = "\"A eosinophil precursor in the granulocytic series, being a cell intermediate in development between a eosinophilic myelocyte and a band form eosinophil.\" [GOC:add, ISBN:0721601464]";

	@Relates("develops_from")
	public EosinophilicMyelocyte EosinophilicMetamyelocyte_develops_from();
}


@Term
interface BandFormEosinophil extends ImmatureEosinophil {
	public static String id = "CL:0000774";
	public static String name = "band form eosinophil";
	public static String def = "\"A late eosinophilic metamyelocyte in which the nucleus is in the form of a curved or coiled band, not having acquired the typical multilobar shape of the mature basophil.\" [GOC:add, ISBN:0721601464]";

	@Relates("develops_from")
	public EosinophilicMetamyelocyte BandFormEosinophil_develops_from();
}


@Term
interface Neutrophil extends Granulocyte {
	public static String id = "CL:0000775";
	public static String name = "neutrophil";
	public static String def = "\"Any of the immature or mature forms of a granular leukocyte that in its mature form has a nucleus with three to five lobes connected by slender threads of chromatin, and cytoplasm containing fine inconspicuous granules and stainable by neutral dyes.\" [GOC:add, ISBN:0721601464]";
}


@Term
interface ImmatureNeutrophil extends Neutrophil {
	public static String id = "CL:0000776";
	public static String name = "immature neutrophil";
	public static String def = "\"Any of the immature forms of a neutrophil in which neutrophilic specific granules are present but other phenotypic features of the mature form may be lacking. A neutrophil is a granular leukocyte that in its mature form has a nucleus with three to five lobes connected by slender threads of chromatin, and cytoplasm containing fine inconspicuous granules and stainable by neutral dyes.\" [GOC:add, ISBN:0721601464]";

	@Relates("develops_from")
	public NeutrophilicPromyelocyte ImmatureNeutrophil_develops_from();
}


@Term
interface MesangialPhagocyte extends TissueResidentMacrophage {
	public static String id = "CL:0000777";
	public static String name = "mesangial phagocyte";
	public static String def = "\"A tissue-resident macrophage of the renal glomerular mesangium.\" [GOC:add, ISBN:0702022918, ISBN:3540536663, PMID:1600140, PMID:16146841]";
}


@Term
interface MononuclearOsteoclast extends Osteoclast {
	public static String id = "CL:0000778";
	public static String name = "mononuclear osteoclast";
	public static String def = "\"A specialized mononuclear osteoclast associated with the absorption and removal of bone, precursor of multinuclear osteoclasts.\" [GOC:add, PMID:12713016, PMID:15055519, PMID:17380158, PMID:9415452]";
}


@Term
interface MultinuclearOsteoclast extends Osteoclast {
	public static String id = "CL:0000779";
	public static String name = "multinuclear osteoclast";
	public static String def = "\"A specialized multinuclear osteoclast associated with the absorption and removal of bone.\" [GOC:add, PMID:12713016, PMID:9415452]";

	@Relates("develops_from")
	public MononuclearOsteoclast MultinuclearOsteoclast_develops_from();
}


@Term
interface MultinuclearOdontoclast extends Odontoclast, MultinuclearOsteoclast {
	public static String id = "CL:0000780";
	public static String name = "multinuclear odontoclast";
	public static String def = "\"A specialized multinuclear osteoclast associated with the absorption and removal of cementum.\" [GOC:add, PMID:9415452]";

	@Relates("develops_from")
	public MononuclearOdontoclast MultinuclearOdontoclast_develops_from();
}


@Term
interface MononuclearOdontoclast extends Odontoclast, MononuclearOsteoclast {
	public static String id = "CL:0000781";
	public static String name = "mononuclear odontoclast";
	public static String def = "\"A specialized mononuclear osteoclast associated with the absorption and removal of cementum.\" [GOC:add, PMID:9415452]";
}


@Term
interface MyeloidDendriticCell extends ConventionalDendriticCell {
	public static String id = "CL:0000782";
	public static String name = "myeloid dendritic cell";
	public static String def = "\"A dendritic cell of the myeloid lineage.\" [GOC:add, PMID:10449155, PMID:9521319]";

	@Relates("develops_from")
	public Monocyte MyeloidDendriticCell_develops_from();
}


@Term
interface MultinucleatedPhagocyte extends MultinucleateCell, PhagocyteSensuVertebrata {
	public static String id = "CL:0000783";
	public static String name = "multinucleated phagocyte";
	public static String def = "\"A phagocyte formed by the fusion of mononuclear phagocytes.\" [GOC:add]";
}


@Term
interface PlasmacytoidDendriticCell extends DendriticCell {
	public static String id = "CL:0000784";
	public static String name = "plasmacytoid dendritic cell";
	public static String def = "\"A dendritic cell type of distinct morphology, localization, and surface marker expression from other dendritic cell types and associated with early stage immune responses, particularly the release of physiologically abundant amounts of type I interferons in response to infection.\" [GOC:add, PMID:15549123, PMID:15596797]";

	@Relates("develops_from")
	public HematopoieticStemCell PlasmacytoidDendriticCell_develops_from();
}


@Term
interface MatureBCell extends BCell {
	public static String id = "CL:0000785";
	public static String name = "mature B cell";
	public static String def = "\"A B cell that is mature, having left the bone marrow. Initially, these cells are IgM-positive and IgD-positive, and they can be activated by antigen.\" [GOC:add, ISBN:0781735149]";

	@Relates("develops_from")
	public ImmatureBCell MatureBCell_develops_from();
}


@Term
interface PlasmaCell extends AntibodySecretingCell {
	public static String id = "CL:0000786";
	public static String name = "plasma cell";
	public static String def = "\"A terminally differentiated, post-mitotic, antibody secreting cell of the B cell lineage with the phenotype CD138-positive, surface immunonoglobulin-negative, and MHC Class II-negative. Plasma cells are oval or round with extensive rough endoplasmic reticulum, a well-developed Golgi apparatus, and a round nucleus having a characteristic cartwheel heterochromatin pattern and are devoted to producing large amounts of immunoglobulin.\" [GO_REF:0000031, GOC:add, ISBN:0721601464, ISBN:0781735149 \"Fundamental Immunology, 6th ed. (WE Paul, ed) Wolters Kluwer (Philadelphia), 2003. 781735149\"]";

	@Relates("develops_from")
	public Plasmablast PlasmaCell_develops_from();
}


@Term
interface MemoryBCell extends MatureBCell {
	public static String id = "CL:0000787";
	public static String name = "memory B cell";
	public static String def = "\"A memory B cell is a mature B cell that is long-lived, readily activated upon re-encounter of its antigenic determinant, and has been selected for expression of higher affinity immunoglobulin. This cell type has the phenotype CD19-positive, CD20-positive, MHC Class II-positive, and CD138-negative.\" [GO_REF:0000031, GOC:add, GOC:rhs, ISBN:0781735149]";
}


@Term
interface NaiveBCell extends MatureBCell {
	public static String id = "CL:0000788";
	public static String name = "naive B cell";
	public static String def = "\"A naive B cell is a mature B cell that has the phenotype surface IgD-positive, surface IgM-positive, CD27-negative, and CD38-negative, and that has not yet been activated by antigen in the periphery.\" [GO_REF:0000031, GOC:add, GOC:rhs, IBSN:0781765196]";

	@Relates("develops_from")
	public TransitionalStageBCell NaiveBCell_develops_from();
}


@Term
interface AlphaBetaTCell extends TCell {
	public static String id = "CL:0000789";
	public static String name = "alpha-beta T cell";
	public static String def = "\"A T cell that expresses an alpha-beta T cell receptor complex.\" [GOC:add, ISBN:0781735149]";
}


@Term
interface ImmatureAlphaBetaTCell extends AlphaBetaTCell {
	public static String id = "CL:0000790";
	public static String name = "immature alpha-beta T cell";
	public static String def = "\"An alpha-beta T cell that has an immature phenotype.\" [GOC:add, ISBN:0781735149]";
}


@Term
interface MatureAlphaBetaTCell extends AlphaBetaTCell {
	public static String id = "CL:0000791";
	public static String name = "mature alpha-beta T cell";
	public static String def = "\"A alpha-beta T cell that has a mature phenotype.\" [GOC:add, ISBN:0781735149]";
}


@Term
interface CD4PositiveCD25PositiveAlphaBetaRegulatoryTCell extends CD4PositiveAlphaBetaTCell, RegulatoryTCell {
	public static String id = "CL:0000792";
	public static String name = "CD4-positive, CD25-positive, alpha-beta regulatory T cell";
	public static String def = "\"A CD4-positive, CD25-positive, alpha-beta T cell that regulates overall immune responses as well as the responses of other T cell subsets through direct cell-cell contact and cytokine release.\" [GOC:add, ISBN:0781735149]";
}


@Term
interface CD4PositiveAlphaBetaIntraepithelialTCell extends CD4PositiveAlphaBetaTCell, AlphaBetaIntraepithelialTCell {
	public static String id = "CL:0000793";
	public static String name = "CD4-positive, alpha-beta intraepithelial T cell";
	public static String def = "\"A CD4-positive, alpha-beta T cell that is found in the columnar epithelium of the gastrointestinal tract. Intraepithelial T cells often have a memory phenotype of CD2-positive, CD5-positive, and CD44-positive.\" [GOC:add, ISBN:0781735149]";

	@Relates("develops_from")
	public CD4PositiveAlphaBetaThymocyte CD4PositiveAlphaBetaIntraepithelialTCell_develops_from();
}


@Term
interface CD8PositiveAlphaBetaCytotoxicTCell extends CD8PositiveAlphaBetaTCell, CytotoxicTCell {
	public static String id = "CL:0000794";
	public static String name = "CD8-positive, alpha-beta cytotoxic T cell";
	public static String def = "\"A CD8-positive, alpha-beta T cell that is capable of killing target cells in an antigen specific manner with the phenotype perforin-positive and granzyme B-positive.\" [GO_REF:0000031, GOC:add, GOC:pam, ISBN:0781735149]";

	@Relates("develops_from")
	public ActivatedCD8PositiveAlphaBetaTCell CD8PositiveAlphaBetaCytotoxicTCell_develops_from();
}


@Term
interface CD8PositiveAlphaBetaRegulatoryTCell extends CD8PositiveAlphaBetaTCell, RegulatoryTCell {
	public static String id = "CL:0000795";
	public static String name = "CD8-positive, alpha-beta regulatory T cell";
	public static String def = "\"A CD8-positive, alpha-beta T cell that regulates overall immune responses as well as the responses of other T cell subsets through direct cell-cell contact and cytokine release.\" [GOC:add, ISBN:0781735149]";
}


@Term
interface CD8AlphaBetaPositiveAlphaBetaIntraepithelialTCell extends AlphaBetaIntraepithelialTCell {
	public static String id = "CL:0000796";
	public static String name = "CD8-alpha-beta-positive, alpha-beta intraepithelial T cell";
	public static String def = "\"A alpha-beta intraepithelial T cell found in the columnar epithelium of the gastrointestinal tract. Intraepithelial T cells often have distinct developmental pathways and activation requirements.\" [GOC:add, ISBN:0781735149]";
}


@Term
interface AlphaBetaIntraepithelialTCell extends MatureAlphaBetaTCell {
	public static String id = "CL:0000797";
	public static String name = "alpha-beta intraepithelial T cell";
	public static String def = "\"A mature alpha-beta T cell of the columnar epithelium of the gastrointestinal tract. Intraepithelial T cells often have distinct developmental pathways and activation requirements.\" [GOC:add, ISBN:0781735149]";
}


@Term
interface GammaDeltaTCell extends TCell {
	public static String id = "CL:0000798";
	public static String name = "gamma-delta T cell";
	public static String def = "\"A T cell that expresses a gamma-delta T cell receptor complex.\" [GOC:add, ISBN:0781735149]";
}


@Term
interface ImmatureGammaDeltaTCell extends GammaDeltaTCell {
	public static String id = "CL:0000799";
	public static String name = "immature gamma-delta T cell";
	public static String def = "\"A gamma-delta T cell that has an immature phenotype.\" [GOC:add, ISBN:0781735149]";

	@Relates("develops_from")
	public DN3Thymocyte ImmatureGammaDeltaTCell_develops_from();
}


@Term
interface MatureGammaDeltaTCell extends GammaDeltaTCell {
	public static String id = "CL:0000800";
	public static String name = "mature gamma-delta T cell";
	public static String def = "\"A gamma-delta T cell that has a mature phenotype. These cells can be found in tissues and circulation where they express unique TCR repertoire depending on their location.\" [GOC:add, ISBN:0781735149]";

	@Relates("develops_from")
	public ImmatureGammaDeltaTCell MatureGammaDeltaTCell_develops_from();
}


@Term
interface GammaDeltaIntraepithelialTCell extends MatureGammaDeltaTCell {
	public static String id = "CL:0000801";
	public static String name = "gamma-delta intraepithelial T cell";
	public static String def = "\"A mature gamma-delta T cell that is found in the columnar epithelium of the gastrointestinal tract. Intraepithelial T cells often have distinct developmental pathways and activation requirements.\" [GOC:add, ISBN:0781735149]";
}


@Term
interface CD8AlphaAlphaPositiveGammaDeltaIntraepithelialTCell extends GammaDeltaIntraepithelialTCell {
	public static String id = "CL:0000802";
	public static String name = "CD8-alpha alpha positive, gamma-delta intraepithelial T cell";
	public static String def = "\"A gamma-delta intraepithelial T cell that has the phenotype CD8-alpha alpha-positive. Intraepithelial T cells often have distinct developmental pathways and activation requirements.\" [GOC:add, ISBN:0781735149]";
}


@Term
interface CD4NegativeCD8NegativeGammaDeltaIntraepithelialTCell extends GammaDeltaIntraepithelialTCell {
	public static String id = "CL:0000803";
	public static String name = "CD4-negative CD8-negative gamma-delta intraepithelial T cell";
	public static String def = "\"A gamma-delta intraepithelial T cell that has the phenotype CD4-negative and CD8-negative. Intraepithelial T cells often have distinct developmental pathways and activation requirements.\" [GOC:add, ISBN:0781735149]";
}


@Term
interface ImmatureSinglePositiveThymocyte extends Thymocyte {
	public static String id = "CL:0000805";
	public static String name = "immature single positive thymocyte";
	public static String def = "\"A thymocyte that has the phenotype CD4-negative, CD8-positive, CD44-negative, CD25-negative, and pre-TCR-positive.\" [GO_REF:0000031, GOC:add, ISBN:0781735149]";

	@Relates("develops_from")
	public DN4Thymocyte ImmatureSinglePositiveThymocyte_develops_from();
}


@Term
interface DN2Thymocyte extends Thymocyte {
	public static String id = "CL:0000806";
	public static String name = "DN2 thymocyte";
	public static String def = "\"A thymocyte that has the phenotype CD4-negative, CD8-negative, CD44-positive, and CD25-positive.\" [GO_REF:0000031, GOC:add, ISBN:0781735149]";

	@Relates("develops_from")
	public DN1ThymicProTCell DN2Thymocyte_develops_from();
}


@Term
interface DN3Thymocyte extends ImmatureAlphaBetaTCell, Thymocyte {
	public static String id = "CL:0000807";
	public static String name = "DN3 thymocyte";
	public static String def = "\"A thymocyte that has the phenotype CD4-negative, CD8-negative, CD44-positive, and CD25-negative and expressing the T cell receptor beta-chain in complex with the pre-T cell receptor alpha chain.\" [GO_REF:0000031, GOC:add, ISBN:0781735149]";

	@Relates("develops_from")
	public DN2Thymocyte DN3Thymocyte_develops_from();
}


@Term
interface DN4Thymocyte extends ImmatureAlphaBetaTCell, Thymocyte {
	public static String id = "CL:0000808";
	public static String name = "DN4 thymocyte";
	public static String def = "\"A thymocyte that has the phenotype CD4-negative, CD8-negative, CD44-negative, CD25-negative, and pre-TCR-positive.\" [GO_REF:0000031, GOC:add, ISBN:0781735149]";

	@Relates("develops_from")
	public DN3Thymocyte DN4Thymocyte_develops_from();
}


@Term
interface DoublePositiveAlphaBetaThymocyte extends ImmatureAlphaBetaTCell {
	public static String id = "CL:0000809";
	public static String name = "double-positive, alpha-beta thymocyte";
	public static String def = "\"A thymocyte expressing the alpha-beta T cell receptor complex as well as both the CD4 and CD8 coreceptors.\" [GO_REF:0000031, GOC:add, ISBN:0781735149]";

	@Relates("develops_from")
	public ImmatureSinglePositiveThymocyte DoublePositiveAlphaBetaThymocyte_develops_from();
}


@Term
interface CD4PositiveAlphaBetaThymocyte extends ImmatureAlphaBetaTCell {
	public static String id = "CL:0000810";
	public static String name = "CD4-positive, alpha-beta thymocyte";
	public static String def = "\"An immature alpha-beta T cell that is located in the thymus and expressing the CD4 coreceptor.\" [GO_REF:0000031, GOC:add, ISBN:0781735149]";

	@Relates("develops_from")
	public DoublePositiveAlphaBetaThymocyte CD4PositiveAlphaBetaThymocyte_develops_from();
}


@Term
interface CD8PositiveAlphaBetaThymocyte extends ImmatureAlphaBetaTCell {
	public static String id = "CL:0000811";
	public static String name = "CD8-positive, alpha-beta thymocyte";
	public static String def = "\"An immature alpha-beta T cell that is located in the thymus and expressing the CD8 coreceptor.\" [GO_REF:0000031, GOC:add, ISBN:0781735149]";

	@Relates("develops_from")
	public DoublePositiveAlphaBetaThymocyte CD8PositiveAlphaBetaThymocyte_develops_from();
}


@Term
interface MemoryTCell extends TCell {
	public static String id = "CL:0000813";
	public static String name = "memory T cell";
	public static String def = "\"A distinctly differentiated long-lived T cell that has the phenotype CD45RO-positive and CD127-positive.\" [GO_REF:0000031, GOC:add, GOC:pam, ISBN:0781735149]";
}


@Term
interface MatureNKTCell extends MatureAlphaBetaTCell {
	public static String id = "CL:0000814";
	public static String name = "mature NK T cell";
	public static String def = "\"A mature alpha-beta T cell of a distinct lineage that bears natural killer markers and a T cell receptor specific for a limited set of ligands. NK T cells have activation and regulatory roles particularly early in an immune response.\" [GOC:add, ISBN:0781735149]";

	@Relates("develops_from")
	public ImmatureNKTCell MatureNKTCell_develops_from();
}


@Term
interface RegulatoryTCell extends TCell {
	public static String id = "CL:0000815";
	public static String name = "regulatory T cell";
	public static String def = "\"A T cell which regulates overall immune responses as well as the responses of other T cell subsets through direct cell-cell contact and cytokine release.\" [GO_REF:0000031, GOC:add]";
}


@Term
interface ImmatureBCell extends PrecursorBCell {
	public static String id = "CL:0000816";
	public static String name = "immature B cell";
	public static String def = "\"An immature B cell is a precursor B cell that has the phenotype surface IgM-positive and surface IgD-negative, and have not undergone class immunoglobulin class switching or peripheral encounter with antigen and activation.\" [GO_REF:0000031, GOC:add, GOC:rhs, ISBN:0781735149 \"Fundamental Immunology, 6th ed. (WE Paul, ed) Wolters Kluwer (Philadelphia), 2003.\"]";

	@Relates("develops_from")
	public ProBCell ImmatureBCell_develops_from();
}


@Term
interface PrecursorBCell extends BCell {
	public static String id = "CL:0000817";
	public static String name = "precursor B cell";
	public static String def = "\"A precursor B cell is a B cell with the phenotype CD10-positive (P08473/NEP_HUMAN; PIRSF001194).\" [GO_REF:0000031, GOC:rhs]";
}


@Term
interface TransitionalStageBCell extends BCell {
	public static String id = "CL:0000818";
	public static String name = "transitional stage B cell";
	public static String def = "\"An immature B cell of an intermediate stage between the pre-B cell stage and the mature naive stage with the phenotype surface IgM-positive and CD19-positive, and are subject to the process of B cell selection. A transitional B cell migrates from the bone marrow into the peripheral circulation, and then to the spleen.\" [GO_REF:0000031, GOC:add, ISBN:0781735149, PMID:12810111]";
}


@Term
interface B1BCell extends MatureBCell {
	public static String id = "CL:0000819";
	public static String name = "B-1 B cell";
	public static String def = "\"A B cell of distinct lineage and surface marker expression. B-1 B cells are thought to be the primary source of natural IgM immunoglobulin, that is, IgM produced in large quantities without prior antigenic stimulation and generally reactive against various microorganisms, as well as the source of T-independent IgA immunoglobulin in the mucosal areas. These cells are CD43-positive.\" [GO_REF:0000031, GOC:add, PMID:11861604]";
}


@Term
interface B1aBCell extends B1BCell {
	public static String id = "CL:0000820";
	public static String name = "B-1a B cell";
	public static String def = "\"A B-1 B cell that has the phenotype CD5-positive.\" [GOC:add, PMID:11861604]";
}


@Term
interface B1bBCell extends B1BCell {
	public static String id = "CL:0000821";
	public static String name = "B-1b B cell";
	public static String def = "\"A B-1 B cell that has the phenotype CD5-negative, but having other phenotypic attributes of a B-1 B cell.\" [GOC:add, PMID:11861604]";
}


@Term
interface B2BCell extends MatureBCell {
	public static String id = "CL:0000822";
	public static String name = "B-2 B cell";
	public static String def = "\"A conventional B cell subject to antigenic stimulation and dependent on T cell help and with a distinct surface marker expression pattern from B-1 B cells. These cells are CD43-negative.\" [GOC:add, ISBN:0781735149, PMID:11861604]";
}


@Term
interface ImmatureNaturalKillerCell extends NaturalKillerCell {
	public static String id = "CL:0000823";
	public static String name = "immature natural killer cell";
	public static String def = "\"A natural killer cell that is developmentally immature, has the phenotype CD34-negative, CD117-positive, CD122-positive, and CD161-positive, and expresses additional natural killer cell receptors (NKR).\" [GO_REF:0000031, GOC:add, ISBN:0781735149, PMID:12457618]";

	@Relates("develops_from")
	public PreNaturalKillerCell ImmatureNaturalKillerCell_develops_from();
}


@Term
interface MatureNaturalKillerCell extends NaturalKillerCell {
	public static String id = "CL:0000824";
	public static String name = "mature natural killer cell";
	public static String def = "\"A natural killer cell that is developmentally mature, has the phenotype CD16-positive, and expresses a variety of inhibitory and activating receptors that recognize NHC class I and other stress related molecules.\" [GO_REF:0000031, GOC:add, ISBN:0781735149, PMID:14685782]";

	@Relates("develops_from")
	public ImmatureNaturalKillerCell MatureNaturalKillerCell_develops_from();
}


@Term
interface ProNKCell extends LymphoidProgenitorCell {
	public static String id = "CL:0000825";
	public static String name = "pro-NK cell";
	public static String def = "\"A lymphoid progenitor cell that is committed to the natural killer cell lineage, expressing CD122 (IL-15) receptor, but lacking many of the phenotypic characteristics of later stages of natural killer cell development such as expression of NK activating and inhibitory molecules. In human this cell has the phenotype CD34-positive, CD45RA-positive, CD10-positive, CD117-negative, and CD161 negative.\" [GO_REF:0000031, GOC:add, GOC:pam, PMID:11532393, PMID:12457618, PMID:15032583, PMID:15766674]";

	@Relates("develops_from")
	public CommonLymphoidProgenitor ProNKCell_develops_from();
}


@Term
interface ProBCell extends LymphoidProgenitorCell {
	public static String id = "CL:0000826";
	public static String name = "pro-B cell";
	public static String def = "\"A progenitor cell of the B cell lineage, with some lineage specific activity such as early stages of recombination of B cell receptor genes, but not yet fully committed to the B cell lineage until the expression of PAX5 occurs.\" [GOC:add, ISBN:0781735149]";

	@Relates("develops_from")
	public CommonLymphoidProgenitor ProBCell_develops_from();
}


@Term
interface ProTCell extends LymphoidProgenitorCell {
	public static String id = "CL:0000827";
	public static String name = "pro-T cell";
	public static String def = "\"A lymphoid progenitor cell of the T cell lineage, with some lineage specific marker expression, but not yet fully committed to the T cell lineage.\" [GOC:add, ISBN:0781735149]";

	@Relates("develops_from")
	public CommonLymphoidProgenitor ProTCell_develops_from();
}


@Term
interface Thromboblast extends MyeloidProgenitorCell {
	public static String id = "CL:0000828";
	public static String name = "thromboblast";
	public static String def = "\"A progenitor cell of the thrombocyte, a nucleated blood cell involved in coagulation typically seen in birds and other non-mammalian vertebrates.\" [GOC:add]";

	@Relates("develops_from")
	public MegakaryocyteErythroidProgenitorCell Thromboblast_develops_from();
}


@Term
interface BasophilicMyeloblast extends Myeloblast {
	public static String id = "CL:0000829";
	public static String name = "basophilic myeloblast";
	public static String def = "\"A myeloblast committed to the basophil lineage. A myeloblast is the most primitive precursor in the granulocytic series, having fine, evenly distributed chromatin, several nucleoli, and a nongranular basophilic cytoplasm.\" [GOC:add, ISBN:0721601464]";

	@Relates("develops_from")
	public BasophilProgenitorCell BasophilicMyeloblast_develops_from();
}


@Term
interface BasophilicPromyelocyte extends Promyelocyte {
	public static String id = "CL:0000830";
	public static String name = "basophilic promyelocyte";
	public static String def = "\"A basophil precursor in the granulocytic series, being a cell intermediate in development between a myeloblast and myelocyte, and containing a few, as yet undifferentiated, cytoplasmic granules.\" [GOC:add, ISBN:0721601464]";

	@Relates("develops_from")
	public BasophilicMyeloblast BasophilicPromyelocyte_develops_from();
}


@Term
interface MastCellProgenitor extends MyeloidProgenitorCell {
	public static String id = "CL:0000831";
	public static String name = "mast cell progenitor";
	public static String def = "\"A progenitor cell of the mast cell lineage.\" [GOC:add, http://www.copewithcytokines.de, PMID:16006518, PMID:16330751, PMID:8629001, PMID:9354811]";

	@Relates("develops_from")
	public GranulocyteMonocyteProgenitorCell MastCellProgenitor_develops_from();
}


@Term
interface EosinophilicMyeloblast extends Myeloblast {
	public static String id = "CL:0000832";
	public static String name = "eosinophilic myeloblast";
	public static String def = "\"A myeloblast committed to the eosinophil lineage. A myeloblast is the most primitive precursor in the granulocytic series, having fine, evenly distributed chromatin, several nucleoli, and a nongranular basophilic cytoplasm.\" [GOC:add, ISBN:0721601464]";

	@Relates("develops_from")
	public EosinophilProgenitorCell EosinophilicMyeloblast_develops_from();
}


@Term
interface EosinophilicPromyelocyte extends Promyelocyte {
	public static String id = "CL:0000833";
	public static String name = "eosinophilic promyelocyte";
	public static String def = "\"A neutrophil precursor in the granulocytic series, being a cell intermediate in development between a myeloblast and myelocyte, and containing a few, as yet undifferentiated, cytoplasmic granules.\" [GOC:add, ISBN:0721601464]";

	@Relates("develops_from")
	public EosinophilicMyeloblast EosinophilicPromyelocyte_develops_from();
}


@Term
interface NeutrophilProgenitorCell extends MyeloidProgenitorCell {
	public static String id = "CL:0000834";
	public static String name = "neutrophil progenitor cell";
	public static String def = "\"A progenitor cell of the neutrophil lineage.\" [GOC:add, ISBN:0721601464]";

	@Relates("develops_from")
	public GranulocyteMonocyteProgenitorCell NeutrophilProgenitorCell_develops_from();
}


@Term
interface Myeloblast extends MyeloidProgenitorCell {
	public static String id = "CL:0000835";
	public static String name = "myeloblast";
	public static String def = "\"The most primitive precursor in the granulocytic series, having fine, evenly distributed chromatin, several nucleoli, and a nongranular basophilic cytoplasm.\" [GOC:add, ISBN:0721601464]";

	@Relates("develops_from")
	public GranulocyteMonocyteProgenitorCell Myeloblast_develops_from();
}


@Term
interface Promyelocyte extends MyeloidProgenitorCell {
	public static String id = "CL:0000836";
	public static String name = "promyelocyte";
	public static String def = "\"A precursor in the granulocytic series, being a cell intermediate in development between a myeloblast and myelocyte, and containing a few, as yet undifferentiated, cytoplasmic granules.\" [GOC:add, ISBN:0721601464]";

	@Relates("develops_from")
	public Myeloblast Promyelocyte_develops_from();
}


@Term
interface HematopoieticProgenitorCell extends NonTerminallyDifferentiatedCell {
	public static String id = "CL:0000837";
	public static String name = "hematopoietic progenitor cell";
	public static String def = "\"A progenitor cell of any hematopoietic lineage, potentially multipotent.\" [GOC:add]";

	@Relates("develops_from")
	public HematopoieticStemCell HematopoieticProgenitorCell_develops_from();
}


@Term
interface LymphoidProgenitorCell extends HematopoieticProgenitorCell {
	public static String id = "CL:0000838";
	public static String name = "lymphoid progenitor cell";
	public static String def = "\"A progenitor cell of any lymphoid lineage, potentially multipotent.\" [GOC:add]";
}


@Term
interface MyeloidProgenitorCell extends HematopoieticProgenitorCell {
	public static String id = "CL:0000839";
	public static String name = "myeloid progenitor cell";
	public static String def = "\"A progenitor cell of any myeloid lineage, potentially multipotent.\" [GOC:add]";
}


@Term
interface ImmatureMyeloidDendriticCell extends MyeloidDendriticCell {
	public static String id = "CL:0000840";
	public static String name = "immature myeloid dendritic cell";
	public static String def = "\"An immature cell of the myeloid dendritic cell lineage, characterized by high levels of antigen uptake via endocytosis, macropinocytosis, and phagocytosis, and typically found resident in the tissues.\" [GOC:add, PMID:9521319]";

	@Relates("develops_from")
	public Monocyte ImmatureMyeloidDendriticCell_develops_from();
}


@Term
interface MatureMyeloidDendriticCell extends MyeloidDendriticCell {
	public static String id = "CL:0000841";
	public static String name = "mature myeloid dendritic cell";
	public static String def = "\"A mature cell of the myeloid dendritic cell lineage, characterized by a high capacity for antigen presentation and typically found in a lymph node.\" [GOC:add, PMID:9521319]";

	@Relates("develops_from")
	public ImmatureMyeloidDendriticCell MatureMyeloidDendriticCell_develops_from();
}


@Term
interface MononuclearCell extends Leukocyte {
	public static String id = "CL:0000842";
	public static String name = "mononuclear cell";
	public static String def = "\"A leukocyte with a single non-segmented nucleus in the mature form.\" [GOC:add]";
}


@Term
interface FollicularBCell extends MatureBCell {
	public static String id = "CL:0000843";
	public static String name = "follicular B cell";
	public static String def = "\"A resting mature B cell that has the phenotype CD23-positive and CD21-positive, and found typically in the B cell follicle region of the spleen.\" [GOC:add, ISBN:0781735149]";
}


@Term
interface GerminalCenterBCell extends MatureBCell {
	public static String id = "CL:0000844";
	public static String name = "germinal center B cell";
	public static String def = "\"A rapidly cycling mature B cell that has distinct phenotypic characteristics and is involved in T-dependent immune responses and located typically in the germinal centers of lymph nodes.\" [GOC:add, ISBN:0781735149]";

	@Relates("develops_from")
	public TransitionalStageBCell GerminalCenterBCell_develops_from();

	@Relates("develops_from")
	public FollicularBCell GerminalCenterBCell_develops_from_1();
}


@Term
interface MarginalZoneBCell extends MatureBCell {
	public static String id = "CL:0000845";
	public static String name = "marginal zone B cell";
	public static String def = "\"A mature B cell that is located in the marginal zone of the spleen with the phenotype CD23-negative and CD21-positive and expressing a B cell receptor usually reactive to bacterial cell wall components or senescent self components such as oxidized-LDL.\" [GOC:add, ISBN:0781735149, PMID:10933592]";
}


@Term
interface VestibularDarkCell extends EpithelialCell {
	public static String id = "CL:0000846";
	public static String name = "vestibular dark cell";
	public static String def = "\"An epithelial cell of the vestibular sensory organ that is characterized by intense enzymatic activities and numerous basal membrane infoldings.\" [PMID:11223304]";
}


@Term
interface CiliatedOlfactoryReceptorNeuron extends OlfactoryReceptorCell {
	public static String id = "CL:0000847";
	public static String name = "ciliated olfactory receptor neuron";
	public static String def = "\"An olfactory receptor cell in which the apical ending of the dendrite is a pronounced ciliated olfactory knob.\" [PMID:16841163]";
}


@Term
interface MicrovillousOlfactoryReceptorNeuron extends OlfactoryReceptorCell {
	public static String id = "CL:0000848";
	public static String name = "microvillous olfactory receptor neuron";
	public static String def = "\"An olfactory receptor cell in which the apical ending of the dendrite is a knob that bears numerous microvilli.\" [PMID:16841163]";
}


@Term
interface CryptOlfactoryReceptorNeuron extends OlfactoryReceptorCell {
	public static String id = "CL:0000849";
	public static String name = "crypt olfactory receptor neuron";
	public static String def = "\"An olfactory receptor cell with short cilia growing in an invagination bordered by microvilli.\" [PMID:16841163]";
}


@Term
interface SerotonergicNeuron extends Neuron {
	public static String id = "CL:0000850";
	public static String name = "serotonergic neuron";
	public static String def = "\"A neuron that releases serotonin as a neurotransmitter.\" [SANBI:mhl]";
}


@Term
interface NeuromastMantleCell extends SecretoryCell {
	public static String id = "CL:0000851";
	public static String name = "neuromast mantle cell";
	public static String def = "\"Neuromast mantle cell is a non-sensory cell. Neuromast mantle cells surround the neuromast support cells and neuromast hair cells, separating the neuromast from the epidermis, and secrete cupula in which the ciliary bundles of all the hair cells are embedded.\" [ISBN:0125296509]";
}


@Term
interface NeuromastSupportCell extends SupportiveCell {
	public static String id = "CL:0000852";
	public static String name = "neuromast support cell";
	public static String def = "\"Neuromast support cell is a non-sensory cell of the neuromast that extend between the sensory hair cells from the basement membrane to the apical surface; neuromast support cells are surrounded by neuromast mantle cells.\" [ISBN:0125296509]";
}


@Term
interface OlfactoryEpithelialSupportCell extends SupportiveCell {
	public static String id = "CL:0000853";
	public static String name = "olfactory epithelial support cell";
	public static String def = "\"Olfactory epithelial support cell is a non ciliated columnar cell that extends from the epithelial free margin to the basement membrane of the olfactory epithelium.\" [SANBI:mhl]";
}


@Term
interface InterneuromastCell extends NeurectodermalCell {
	public static String id = "CL:0000854";
	public static String name = "interneuromast cell";
	public static String def = "\"Interneuromast cell is a neuroectodermal cell deposited by the migrating lateral line primordium between the neuromasts. Interneuromast cells proliferate and migrate to form additional neuromasts.\" [SANBI:mhl]";

	@Relates("develops_from")
	public NeuroplacodalCell InterneuromastCell_develops_from();
}


@Term
interface HairCell extends MechanoreceptorCell {
	public static String id = "CL:0000855";
	public static String name = "hair cell";
	public static String def = "\"Hair cell is a mechanoreceptor cell that is sensitive to movement of the hair-like projections (stereocilia and kinocilia) which relay the information centrally in the nervous system.\" [SANBI:mhl]";
}


@Term
interface NeuromastHairCell extends HairCell {
	public static String id = "CL:0000856";
	public static String name = "neuromast hair cell";
	public static String def = "\"Neuromast hair cell is a hair cell that acts as a sensory receptor of the neuromast; it is morphologically polarized as a result of the relative position of the single kinocilium and the clusters of stereocilia on its apical surface.\" [SANBI:mhl]";
}


@Term
interface SlowMuscleMyoblast extends SkeletalMuscleMyoblast {
	public static String id = "CL:0000857";
	public static String name = "slow muscle myoblast";
	public static String def = "\"A skeletal muscle myoblast that differentiates into slow muscle fibers.\" [SANBI:mhl]";
}


@Term
interface FastMuscleMyoblast extends SkeletalMuscleMyoblast {
	public static String id = "CL:0000858";
	public static String name = "fast muscle myoblast";
	public static String def = "\"A skeletal muscle myoblast that differentiates into fast muscle fibers.\" [SANBI:mhl]";
}


@Term
interface CementumSecretingCell extends SecretoryCell {
	public static String id = "CL:0000859";
	public static String name = "cementum secreting cell";
	public static String def = "\"A secretory cell that secretes cementum, a bony substance that covers the root of a tooth.\" [SANBI:mhl]";
}


@Term
interface InflammatoryMonocyte extends Monocyte {
	public static String id = "CL:0000860";
	public static String name = "inflammatory monocyte";
	public static String def = "\"A type of monocyte characterised by high expression of CCR2, increased responsiveness to monocyte chemoattractant CCL2/MCP1, and increased phagocytic activity.\" [GO_REF:0000031, GOC:ana, PMID:16322748, PMID:18303997]";
}


@Term
interface ElicitedMacrophage extends Macrophage {
	public static String id = "CL:0000861";
	public static String name = "elicited macrophage";
	public static String def = "\"A macrophage which develops from an inflammatory monocyte and is recruited into the tissues in response to injury and infection as part of an inflammatory response.\" [GO_REF:0000031, GOC:add, GOC:ana, PMID:15771589]";

	@Relates("develops_from")
	public InflammatoryMonocyte ElicitedMacrophage_develops_from();
}


@Term
interface SuppressorMacrophage extends ElicitedMacrophage {
	public static String id = "CL:0000862";
	public static String name = "suppressor macrophage";
	public static String def = "\"A macrophage that suppresses immune reponses.\" [GOC:add]";
}


@Term
interface InflammatoryMacrophage extends ElicitedMacrophage {
	public static String id = "CL:0000863";
	public static String name = "inflammatory macrophage";
	public static String def = "\"An elicited macrophage that is recruited into the tissues in response to injury and infection as part of an inflammatory response, expresses high levels of pro-inflammatoy cytokines, ROS and NO, and shows potent microbicidal activity.\" [GO_REF:0000031, GOC:ana]";
}


@Term
interface TissueResidentMacrophage extends Macrophage {
	public static String id = "CL:0000864";
	public static String name = "tissue-resident macrophage";
	public static String def = "\"A macrophage constitutively resident in a particular tissue under non-inflammatory conditions, and capable of phagocytosing a variety of extracellular particulate material, including immune complexes, microorganisms, and dead cells.\" [GO_REF:0000031, GOC:ana]";
}


@Term
interface GastrointestinalTractLaminaPropriaMacrophage extends GutAssociatedLymphoidTissueMacrophage {
	public static String id = "CL:0000865";
	public static String name = "gastrointestinal tract (lamina propria) macrophage";
	public static String def = "\"A gut-associated lymphoid tissue macrophage found in lamnia propria of the gut.\" [GO_REF:0000031, GOC:ana]";
}


@Term
interface ThymicMacrophage extends TissueResidentMacrophage {
	public static String id = "CL:0000866";
	public static String name = "thymic macrophage";
	public static String def = "\"A tissue-resident macrophage resident found in the thymus, involved in the clearance of apoptotic thymocytes.\" [GO_REF:0000031, GOC:ana]";
}


@Term
interface SecondaryLymphoidOrganMacrophage extends TissueResidentMacrophage {
	public static String id = "CL:0000867";
	public static String name = "secondary lymphoid organ macrophage";
	public static String def = "\"A tissue-resident macrophage found in a secondary lymphoid organ.\" [GO_REF:0000031, GOC:ana]";
}


@Term
interface LymphNodeMacrophage extends SecondaryLymphoidOrganMacrophage {
	public static String id = "CL:0000868";
	public static String name = "lymph node macrophage";
	public static String def = "\"A secondary lymophoid organ macrophage found in a lymph node.\" [GO_REF:0000031, GOC:ana]";
}


@Term
interface TonsillarMacrophage extends MucosaAssociatedLymphoidTissueMacrophage {
	public static String id = "CL:0000869";
	public static String name = "tonsillar macrophage";
	public static String def = "\"A gut-associated lymphoid tissue macrophage found in tonsils.\" [GO_REF:0000031, GOC:ana]";
}


@Term
interface PeyersPatchMacrophage extends GutAssociatedLymphoidTissueMacrophage {
	public static String id = "CL:0000870";
	public static String name = "Peyer's patch macrophage";
	public static String def = "\"A gut-associated lymphoid tissue macrophage found in the Peyer's patches.\" [GO_REF:0000031, GOC:ana]";
}


@Term
interface SplenicMacrophage extends SecondaryLymphoidOrganMacrophage {
	public static String id = "CL:0000871";
	public static String name = "splenic macrophage";
	public static String def = "\"A secondary lymophoid organ macrophage found in the spleen.\" [GO_REF:0000031, GOC:ana, PMID:15771589, PMID:16322748]";
}


@Term
interface SplenicMarginalZoneMacrophage extends SplenicMacrophage {
	public static String id = "CL:0000872";
	public static String name = "splenic marginal zone macrophage";
	public static String def = "\"A splenic macrophage found in the marginal zone of the spleen, involved in recognition and clearance of particulate material from the splenic circulation.\" [GO_REF:0000031, GOC:ana]";
}


@Term
interface SplenicMetallophillicMacrophage extends SplenicMacrophage {
	public static String id = "CL:0000873";
	public static String name = "splenic metallophillic macrophage";
	public static String def = "\"A splenic macrophage found in the areas surrounding the white pulp of the spleen, adjacent to the marginal sinus.\" [GO_REF:0000031, GOC:ana]";
}


@Term
interface SplenicRedPulpMacrophage extends SplenicMacrophage {
	public static String id = "CL:0000874";
	public static String name = "splenic red pulp macrophage";
	public static String def = "\"A splenic macrophage found in the red-pulp of the spleen, and involved in immune responses to blood-borne pathogens and in the clearance of senescent erythrocytes.\" [GO_REF:0000031, GOC:ana]";
}


@Term
interface ResidentMonocyte extends Monocyte {
	public static String id = "CL:0000875";
	public static String name = "resident monocyte";
	public static String def = "\"Subset of monocytes characterised by low expression of CCR2, low responsiveness to monocyte chemoattractant CCL2/MCP1, low phagocytic activity, but increased co-stimulatory activity.\" [GO_REF:0000031, GOC:ana, PMID:16322748, PMID:18303997]";
}


@Term
interface SplenicWhitePulpMacrophage extends SplenicMacrophage {
	public static String id = "CL:0000876";
	public static String name = "splenic white pulp macrophage";
	public static String def = "\"A splenic macrophage found in the white pulp of the spleen.\" [GO_REF:0000031, GOC:ana]";
}


@Term
interface SplenicTingibleBodyMacrophage extends SplenicWhitePulpMacrophage {
	public static String id = "CL:0000877";
	public static String name = "splenic tingible body macrophage";
	public static String def = "\"A splenic white pulp macrophage found in and around the germinal centres of the white pulp of the spleen that participates in phagocytosis of apoptotic B cells from the germinal centres.\" [GO_REF:0000031, GOC:ana]";
}


@Term
interface CentralNervousSystemMacrophage extends TissueResidentMacrophage {
	public static String id = "CL:0000878";
	public static String name = "central nervous system macrophage";
	public static String def = "\"A tissue-resident macrophage found in the central nervous system.\" [GO_REF:0000031, GOC:ana, PMID:16322748]";
}


@Term
interface MeningealMacrophage extends CentralNervousSystemMacrophage {
	public static String id = "CL:0000879";
	public static String name = "meningeal macrophage";
	public static String def = "\"A central nervous system macrophage found in the meninges (the three membranes that surround the brain).\" [GO_REF:0000031, GOC:ana]";
}


@Term
interface ChoroidPlexusMacrophage extends CentralNervousSystemMacrophage {
	public static String id = "CL:0000880";
	public static String name = "choroid-plexus macrophage";
	public static String def = "\"A central nervous system macrophage found at the interface between the blood and the cerebrospinal fluid in the brain.\" [GO_REF:0000031, GOC:ana]";
}


@Term
interface PerivascularMacrophage extends CentralNervousSystemMacrophage {
	public static String id = "CL:0000881";
	public static String name = "perivascular macrophage";
	public static String def = "\"A central nervous system macrophage found in small blood vessels in the brain.\" [GO_REF:0000031, GOC:ana, PMID:16507898]";
}


@Term
interface ThymicMedullaryMacrophage extends ThymicMacrophage {
	public static String id = "CL:0000882";
	public static String name = "thymic medullary macrophage";
	public static String def = "\"A thymic macrophage found in the thymic medulla.\" [GO_REF:0000031, GOC:ana]";
}


@Term
interface ThymicCorticalMacrophage extends ThymicMacrophage {
	public static String id = "CL:0000883";
	public static String name = "thymic cortical macrophage";
	public static String def = "\"A thymic macrophage found in the thymic cortex.\" [GO_REF:0000031, GOC:ana]";
}


@Term
interface MucosaAssociatedLymphoidTissueMacrophage extends SecondaryLymphoidOrganMacrophage {
	public static String id = "CL:0000884";
	public static String name = "mucosa-associated lymphoid tissue macrophage";
	public static String def = "\"A tissue-resident macrophage found in the mucosa associated lymphoid tissue.\" [GO_REF:0000031, GOC:ana]";
}


@Term
interface GutAssociatedLymphoidTissueMacrophage extends MucosaAssociatedLymphoidTissueMacrophage {
	public static String id = "CL:0000885";
	public static String name = "gut-associated lymphoid tissue macrophage";
	public static String def = "\"A mucosa-associated lymphoid tissue macrophage found in the mucosa-associated lymphoid tissues of the gut.\" [GO_REF:0000031, GOC:ana]";
}


@Term
interface NasalAndBroncialAssociatedLymphoidTissueMacrophage extends MucosaAssociatedLymphoidTissueMacrophage {
	public static String id = "CL:0000886";
	public static String name = "nasal and broncial associated lymphoid tissue macrophage";
	public static String def = "\"A mucosa-associated lymphoid tissue macrophage found in the nasal and bronchial mucosa-associated lymphoid tissues.\" [GO_REF:0000031, GOC:ana]";
}


@Term
interface LymphNodeSubcapsularSinusMacrophage extends LymphNodeMacrophage {
	public static String id = "CL:0000887";
	public static String name = "lymph node subcapsular sinus macrophage";
	public static String def = "\"A lymph node macrophage found in the subcapsular sinus of lymph nodes that participates in sensing, clearance, and antigen presentation of lymph-borne particulate antigens.\" [GO_REF:0000031, GOC:ana PMID:14668803, PMID:17934446]";
}


@Term
interface LymphNodeTingibleBodyMacrophage extends LymphNodeMacrophage {
	public static String id = "CL:0000888";
	public static String name = "lymph node tingible body macrophage";
	public static String def = "\"A lymph node macrophage found in the cortex of lymph nodes, in particular in and around the germinal centres, and that participates in phagocytosis of apoptotic B cells from the germinal centres.\" [GO_REF:0000031, GOC:ana]";
}


@Term
interface MyeloidSuppressorCell extends MyeloidLeukocyte {
	public static String id = "CL:0000889";
	public static String name = "myeloid suppressor cell";
	public static String def = "\"An immature myeloid leukocyte of heterogeneous phenotype found particularly in cancer and sepsis patients that is capable of suppressing activity of T cells in ex vivo assays.\" [GO_REF:0000031, GOC:add, GOC:ana, PMID:16168663, PMID:17016554, PMID:17016559]";
}


@Term
interface AlternativelyActivatedMacrophage extends ElicitedMacrophage {
	public static String id = "CL:0000890";
	public static String name = "alternatively activated macrophage";
	public static String def = "\"An elicited macrophage characterized by low production of pro-inflamatory and Th1 polarizing cytokines and high expression of arginase-1, and associated with tissue remodelling.\" [GO_REF:0000031, GOC:ana]";
}


@Term
interface FoamCell extends AnimalCell {
	public static String id = "CL:0000891";
	public static String name = "foam cell";
	public static String def = "\"A type of cell containing lipids in small vacuoles and typically seen in atherolosclerotic lesions, as well as other conditions.\" [GOC:add]";
}


@Term
interface SmoothMuscleCellDerivedFoamCell extends FoamCell {
	public static String id = "CL:0000892";
	public static String name = "smooth muscle cell derived foam cell";
	public static String def = "\"A type of foam cell derived from a smooth muscle cell containing lipids in small vacuoles and typically seen in atherolosclerotic lesions, as well as other conditions.\" [GOC:add]";

	@Relates("develops_from")
	public SmoothMuscleCell SmoothMuscleCellDerivedFoamCell_develops_from();
}


@Term
interface Thymocyte extends TCell {
	public static String id = "CL:0000893";
	public static String name = "thymocyte";
	public static String def = "\"An immature T cell located in the thymus.\" [GO_REF:0000031, GOC:add]";
}


@Term
interface DN1ThymicProTCell extends ProTCell {
	public static String id = "CL:0000894";
	public static String name = "DN1 thymic pro-T cell";
	public static String def = "\"A pro-T cell that has the phenotype CD4-negative, CD8-negative, CD44-positive, and CD25-negative.\" [GO_REF:0000031, GOC:add, GOC:pam]";
}


@Term
interface NaiveThymusDerivedCD4PositiveAlphaBetaTCell extends CD4PositiveAlphaBetaTCell, NaiveTCell {
	public static String id = "CL:0000895";
	public static String name = "naive thymus-derived CD4-positive, alpha-beta T cell";
	public static String def = "\"An antigen inexperienced CD4-positive, alpha-beta T cell with the phenotype CCR7-positive and CD62L-positive. This cell type develops in the thymus.\" [GO_REF:0000031, GOC:add, GOC:pam]";

	@Relates("develops_from")
	public CD4PositiveAlphaBetaThymocyte NaiveThymusDerivedCD4PositiveAlphaBetaTCell_develops_from();
}


@Term
interface ActivatedCD4PositiveAlphaBetaTCell extends CD4PositiveAlphaBetaTCell {
	public static String id = "CL:0000896";
	public static String name = "activated CD4-positive, alpha-beta T cell";
	public static String def = "\"A recently activated CD4-positive, alpha-beta T cell with the phenotype CD69-positive, CD62L-negative, CD127-negative, and CD25-positive.\" [GO_REF:0000031, GOC:add, GOC:pam]";

	@Relates("develops_from")
	public NaiveThymusDerivedCD4PositiveAlphaBetaTCell ActivatedCD4PositiveAlphaBetaTCell_develops_from();
}


@Term
interface CD4PositiveAlphaBetaMemoryTCell extends CD4PositiveAlphaBetaTCell, MemoryTCell {
	public static String id = "CL:0000897";
	public static String name = "CD4-positive, alpha-beta memory T cell";
	public static String def = "\"CD4-positive, alpha-beta long-lived T cell with the phenotype CD45RO-positive and CD127-positive.\" [GO_REF:0000031, GOC:add, GOC:pam, ISBN:0781735149]";

	@Relates("develops_from")
	public ActivatedCD4PositiveAlphaBetaTCell CD4PositiveAlphaBetaMemoryTCell_develops_from();
}


@Term
interface NaiveTCell extends TCell {
	public static String id = "CL:0000898";
	public static String name = "naive T cell";
	public static String def = "\"Mature T cell not yet exposed to antigen with the phenotype CCR7-positive, CD45RA-positive, and CD127-positive.\" [GO_REF:0000031, GOC:add, GOC:pam]";
}


@Term
interface THelper17Cell extends CD4PositiveHelperTCell {
	public static String id = "CL:0000899";
	public static String name = "T-helper 17 cell";
	public static String def = "\"CD4-positive, alpha-beta T cell with the phenotype RORgamma-t-positive that produces IL-17.\" [GO_REF:0000031, GOC:add, GOC:pam]";

	@Relates("develops_from")
	public ActivatedCD4PositiveAlphaBetaTCell THelper17Cell_develops_from();
}


@Term
interface NaiveThymusDerivedCD8PositiveAlphaBetaTCell extends CD8PositiveAlphaBetaTCell, NaiveTCell {
	public static String id = "CL:0000900";
	public static String name = "naive thymus-derived CD8-positive, alpha-beta T cell";
	public static String def = "\"A CD8-positive, alpha-beta T cell that has not experienced activation via antigen contact and has the phenotype CCR7 positive and CD127 positive.\" [GO_REF:0000031, GOC:add, GOC:pam, ISBN:0781735149]";

	@Relates("develops_from")
	public CD8PositiveAlphaBetaThymocyte NaiveThymusDerivedCD8PositiveAlphaBetaTCell_develops_from();
}


@Term
interface Tr1Cell extends CD4PositiveCD25PositiveAlphaBetaRegulatoryTCell {
	public static String id = "CL:0000901";
	public static String name = "Tr1 cell";
	public static String def = "\"CD4-positive alpha-beta T cell with regulatory function that produces IL-10.\" [GO_REF:0000031, GOC:add, GOC:pam]";

	@Relates("develops_from")
	public ActivatedCD4PositiveAlphaBetaTCell Tr1Cell_develops_from();
}


@Term
interface InducedTRegulatoryCell extends CD4PositiveCD25PositiveAlphaBetaRegulatoryTCell {
	public static String id = "CL:0000902";
	public static String name = "induced T-regulatory cell";
	public static String def = "\"CD4-positive alpha-beta T cell with the phenotype CD25-positive, CTLA-4-positive, and FoxP3-positive with regulatory function.\" [GO_REF:0000031, GOC:add, GOC:pam]";

	@Relates("develops_from")
	public ActivatedCD4PositiveAlphaBetaTCell InducedTRegulatoryCell_develops_from();
}


@Term
interface NaturalTRegulatoryCell extends CD4PositiveCD25PositiveAlphaBetaRegulatoryTCell {
	public static String id = "CL:0000903";
	public static String name = "natural T-regulatory cell";
	public static String def = "\"CD4-positive alpha-beta T cell with the phenotype FoxP3-positive, CD25-positive, CD62L-positive, and CTLA-4 positive with regulatory function.\" [GO_REF:0000031, GOC:add, GOC:pam]";

	@Relates("develops_from")
	public DoublePositiveAlphaBetaThymocyte NaturalTRegulatoryCell_develops_from();
}


@Term
interface CentralMemoryCD4PositiveAlphaBetaTCell extends CD4PositiveAlphaBetaMemoryTCell {
	public static String id = "CL:0000904";
	public static String name = "central memory CD4-positive, alpha-beta T cell";
	public static String def = "\"CD4-positive, alpha-beta memory T cell with the phenotype CCR7-positive, CD127-positive, CD45RO-positive, and CD25-negative.\" [GO_REF:0000031, GOC:add, GOC:pam]";
}


@Term
interface EffectorMemoryCD4PositiveAlphaBetaTCell extends CD4PositiveAlphaBetaMemoryTCell {
	public static String id = "CL:0000905";
	public static String name = "effector memory CD4-positive, alpha-beta T cell";
	public static String def = "\"CD4-positive, alpha-beta memory T cell with the phenotype CCR7-negative, CD127-positive, CD45RO-positive, and CD25-negative.\" [GO_REF:0000031, GOC:add, GOC:pam]";
}


@Term
interface ActivatedCD8PositiveAlphaBetaTCell extends CD8PositiveAlphaBetaTCell {
	public static String id = "CL:0000906";
	public static String name = "activated CD8-positive, alpha-beta T cell";
	public static String def = "\"A CD8-positive, alpha-beta T cell with the phenotype CD69-positive, CD62L-negative, CD127-negative, CD25-positive, and CCR7-negative.\" [GO_REF:0000031, GOC:add, GOC:pam]";

	@Relates("develops_from")
	public NaiveThymusDerivedCD8PositiveAlphaBetaTCell ActivatedCD8PositiveAlphaBetaTCell_develops_from();
}


@Term
interface CentralMemoryCD8PositiveAlphaBetaTCell extends CD8PositiveAlphaBetaMemoryTCell {
	public static String id = "CL:0000907";
	public static String name = "central memory CD8 positive, alpha-beta T cell";
	public static String def = "\"A CD8-positive, alpha beta memory T cell with the phenotype CCR7-positive, CD127-positive, CD45RO-positive, and CD25-negative.\" [GO_REF:0000031, GOC:add, GOC:pam]";
}


@Term
interface CD8PositiveAlphaBetaCytokineSecretingEffectorTCell extends CD8PositiveAlphaBetaTCell, HelperTCell {
	public static String id = "CL:0000908";
	public static String name = "CD8-positive, alpha-beta cytokine secreting effector T cell";
	public static String def = "\"A CD8-positive, alpha-beta T cell with the phenotype CD69-positive, CD62L-negative, CD127-negative, and CD25-positive, that secretes interferon-gamma.\" [GO_REF:0000031, GOC:add, GOC:pam]";

	@Relates("develops_from")
	public ActivatedCD8PositiveAlphaBetaTCell CD8PositiveAlphaBetaCytokineSecretingEffectorTCell_develops_from();
}


@Term
interface CD8PositiveAlphaBetaMemoryTCell extends CD8PositiveAlphaBetaTCell, MemoryTCell {
	public static String id = "CL:0000909";
	public static String name = "CD8-positive, alpha-beta memory T cell";
	public static String def = "\"A CD8-positive, alpha-beta T cell with memory phenotype.\" [GO_REF:0000031, GOC:add]";

	@Relates("develops_from")
	public ActivatedCD8PositiveAlphaBetaTCell CD8PositiveAlphaBetaMemoryTCell_develops_from();
}


@Term
interface CytotoxicTCell extends EffectorTCell {
	public static String id = "CL:0000910";
	public static String name = "cytotoxic T cell";
	public static String def = "\"A mature T cell that differentiated and acquired cytotoxic function with the phenotype perforin-positive and granzyme-B positive.\" [GO_REF:0000031, GOC:add, GOC:pam]";
}


@Term
interface EffectorTCell extends TCell {
	public static String id = "CL:0000911";
	public static String name = "effector T cell";
	public static String def = "\"A differentiated T cell with ability to traffic to peripheral tissues that has acquired helper or cytotoxic functions.\" [GO_REF:0000031, GOC:add, GOC:pam]";
}


@Term
interface HelperTCell extends EffectorTCell {
	public static String id = "CL:0000912";
	public static String name = "helper T cell";
	public static String def = "\"A effector T cell that provides help in the form of secreted cytokines to other immune cells.\" [GO_REF:0000031, GOC:add, GOC:pam]";
}


@Term
interface EffectorMemoryCD8PositiveAlphaBetaTCell extends CD8PositiveAlphaBetaMemoryTCell {
	public static String id = "CL:0000913";
	public static String name = "effector memory CD8-positive, alpha-beta T cell";
	public static String def = "\"A CD8-positive, alpha beta memory T cell with the phenotype CCR7-negative, CD127-positive, CD45RO-positive, and CD25-negative.\" [GO_REF:0000031, GOC:add, GOC:pam]";
}


@Term
interface ImmatureNKTCell extends ImmatureAlphaBetaTCell {
	public static String id = "CL:0000914";
	public static String name = "immature NK T cell";
	public static String def = "\"A CD4-positive alpha-beta T cell expressing NK cell markers and a CD1d-restricted T cell receptor and found in the thymus.\" [GO_REF:0000031, GOC:add, GOC:pam]";

	@Relates("develops_from")
	public DoublePositiveAlphaBetaThymocyte ImmatureNKTCell_develops_from();
}


@Term
interface CD8AlphaAlphaPositiveAlphaBetaIntraepithelialTCell extends AlphaBetaIntraepithelialTCell {
	public static String id = "CL:0000915";
	public static String name = "CD8-alpha-alpha-positive, alpha-beta intraepithelial T cell";
	public static String def = "\"An alpha-beta intraepithelial T cell with the phenotype CD8-alpha-alpha-positive located in the columnar epithelium of the gastrointestinal tract. These cells have a memory phenotype of CD2-negative and CD5-negative.\" [GO_REF:0000031, GOC:add, GOC:pam]";

	@Relates("develops_from")
	public CD8PositiveAlphaBetaThymocyte CD8AlphaAlphaPositiveAlphaBetaIntraepithelialTCell_develops_from();
}


@Term
interface DendriticEpidermalTCell extends MatureGammaDeltaTCell {
	public static String id = "CL:0000916";
	public static String name = "dendritic epidermal T cell";
	public static String def = "\"A mature gamma-delta T cell located in the skin.\" [GO_REF:0000031, GOC:add, GOC:pam]";
}


@Term
interface Tc1Cell extends CD8PositiveAlphaBetaCytokineSecretingEffectorTCell {
	public static String id = "CL:0000917";
	public static String name = "Tc1 cell";
	public static String def = "\"A CD8-positive, alpha-beta positive T cell expressing T-bet and eomesodermin and secreting interferon-gamma.\" [GO_REF:0000031, GOC:add, GOC:pam]";
}


@Term
interface Tc2Cell extends CD8PositiveAlphaBetaCytokineSecretingEffectorTCell {
	public static String id = "CL:0000918";
	public static String name = "Tc2 cell";
	public static String def = "\"A CD8-positive, alpha-beta positive T cell expressing GATA-3 and secreting IL-4.\" [GO_REF:0000031, GOC:add, GOC:pam]";
}


@Term
interface CD8PositiveCD25PositiveAlphaBetaRegulatoryTCell extends CD8PositiveAlphaBetaRegulatoryTCell {
	public static String id = "CL:0000919";
	public static String name = "CD8-positive, CD25-positive, alpha-beta regulatory T cell";
	public static String def = "\"A CD8-positive alpha beta-positive T cell with the phenotype FoxP3-positive and having suppressor function.\" [GO_REF:0000031, GOC:add, GOC:pam]";

	@Relates("develops_from")
	public ActivatedCD8PositiveAlphaBetaTCell CD8PositiveCD25PositiveAlphaBetaRegulatoryTCell_develops_from();
}


@Term
interface CD8PositiveCD28NegativeAlphaBetaRegulatoryTCell extends CD8PositiveAlphaBetaRegulatoryTCell {
	public static String id = "CL:0000920";
	public static String name = "CD8-positive, CD28-negative, alpha-beta regulatory T cell";
	public static String def = "\"CD8-positive, alpha-beta positive regulatory T cell with the phenotype CD28-negative and FoxP3-positive.\" [GO_REF:0000031, GOC:add, GOC:pam]";

	@Relates("develops_from")
	public ActivatedCD8PositiveAlphaBetaTCell CD8PositiveCD28NegativeAlphaBetaRegulatoryTCell_develops_from();
}


@Term
interface TypeINKTCell extends MatureNKTCell {
	public static String id = "CL:0000921";
	public static String name = "type I NK T cell";
	public static String def = "\"An alpha-beta T cell expressing NK cell markers that is CD1d restricted and expresses specific V-alpha chains.\" [GO_REF:0000031, GOC:add, GOC:pam]";
}


@Term
interface TypeIINKTCell extends MatureNKTCell {
	public static String id = "CL:0000922";
	public static String name = "type II NK T cell";
	public static String def = "\"An alpha-beta T cell expressing NK call markers that is CD1d restricted and expresses a diverse TCR repertoire.\" [GO_REF:0000031, GOC:add, GOC:pam]";
}


@Term
interface CD4PositiveTypeINKTCell extends TypeINKTCell {
	public static String id = "CL:0000923";
	public static String name = "CD4-positive type I NK T cell";
	public static String def = "\"A type I NK T cell that has the phenotype CD4-positive.\" [GO_REF:0000031, GOC:add, GOC:pam]";
}


@Term
interface CD4NegativeCD8NegativeTypeINKTCell extends TypeINKTCell {
	public static String id = "CL:0000924";
	public static String name = "CD4-negative, CD8-negative type I NK T cell";
	public static String def = "\"A type I NK T cell that has the phenotype CD4-negative and CD8-negative.\" [GO_REF:0000031, GOC:add, GOC:pam]";
}


@Term
interface ActivatedCD4PositiveTypeINKTCell extends MatureNKTCell, TypeINKTCell {
	public static String id = "CL:0000925";
	public static String name = "activated CD4-positive type I NK T cell";
	public static String def = "\"A type I NK T cell that has been recently activated, secrets interferon-gamma and IL-4, and has the phenotype CD4-positive, CD69-positive, and downregulated NK markers.\" [GO_REF:0000031, GOC:add, GOC:pam]";

	@Relates("develops_from")
	public CD4PositiveTypeINKTCell ActivatedCD4PositiveTypeINKTCell_develops_from();
}


@Term
interface CD4PositiveTypeINKTCellSecretingInterferonGamma extends MatureNKTCell {
	public static String id = "CL:0000926";
	public static String name = "CD4-positive type I NK T cell secreting interferon-gamma";
	public static String def = "\"A mature NK T cell that secretes interferon-gamma and enhances type 1 immune responses.\" [GO_REF:0000031, GOC:add, GOC:pam]";

	@Relates("develops_from")
	public ActivatedCD4PositiveTypeINKTCell CD4PositiveTypeINKTCellSecretingInterferonGamma_develops_from();
}


@Term
interface CD4PositiveTypeINKTCellSecretingInterleukin4 extends MatureNKTCell {
	public static String id = "CL:0000927";
	public static String name = "CD4-positive type I NK T cell secreting interleukin-4";
	public static String def = "\"A mature NK T cell that predominantly secretes type 2 cytokines such as interleukin-4 and interleukin-13 and enhances type 2 immune responses.\" [GO_REF:0000031, GOC:add, GOC:pam]";

	@Relates("develops_from")
	public ActivatedCD4PositiveTypeINKTCell CD4PositiveTypeINKTCellSecretingInterleukin4_develops_from();
}


@Term
interface ActivatedCD4NegativeCD8NegativeTypeINKTCell extends TypeINKTCell {
	public static String id = "CL:0000928";
	public static String name = "activated CD4-negative, CD8-negative type I NK T cell";
	public static String def = "\"A type I NK T cell that has been recently activated, secretes interferon-gamma and interleukin-4, and has phenotype CD4-negative, CD8-negative, CD69-positive, and downregulated NK markers.\" [GO_REF:0000031, GOC:add, GOC:pam]";

	@Relates("develops_from")
	public CD4NegativeCD8NegativeTypeINKTCell ActivatedCD4NegativeCD8NegativeTypeINKTCell_develops_from();
}


@Term
interface CD4NegativeCD8NegativeTypeINKTCellSecretingInterferonGamma extends MatureNKTCell {
	public static String id = "CL:0000929";
	public static String name = "CD4-negative, CD8-negative type I NK T cell secreting interferon-gamma";
	public static String def = "\"A mature NK T cell that secretes interferon-gamma and enhances Th1 immune responses.\" [GO_REF:0000031, GOC:add, GOC:pam]";

	@Relates("develops_from")
	public ActivatedCD4NegativeCD8NegativeTypeINKTCell CD4NegativeCD8NegativeTypeINKTCellSecretingInterferonGamma_develops_from();
}


@Term
interface CD4NegativeCD8NegativeTypeINKTCellSecretingInterleukin4 extends MatureNKTCell {
	public static String id = "CL:0000930";
	public static String name = "CD4-negative, CD8-negative type I NK T cell secreting interleukin-4";
	public static String def = "\"A mature NK T cell that secretes interleukin-4 and enhances Th2 immune responses.\" [GO_REF:0000031, GOC:add, GOC:pam]";

	@Relates("develops_from")
	public ActivatedCD4NegativeCD8NegativeTypeINKTCell CD4NegativeCD8NegativeTypeINKTCellSecretingInterleukin4_develops_from();
}


@Term
interface ActivatedTypeIINKTCell extends TypeIINKTCell {
	public static String id = "CL:0000931";
	public static String name = "activated type II NK T cell";
	public static String def = "\"A type II NK T cell that has been recently activated, secretes interferon-gamma and interleukin-4, and has the phenotype CD69-positive and downregulated NK markers.\" [GO_REF:0000031, GOC:add, GOC:pam]";
}


@Term
interface TypeIINKTCellSecretingInterferonGamma extends MatureNKTCell {
	public static String id = "CL:0000932";
	public static String name = "type II NK T cell secreting interferon-gamma";
	public static String def = "\"A type II NK T cell that has been recently activated, secretes interferon-gamma, and has the phenotype CD69-positive and downregulated NK markers.\" [GO_REF:0000031, GOC:add, GOC:pam]";

	@Relates("develops_from")
	public ActivatedTypeIINKTCell TypeIINKTCellSecretingInterferonGamma_develops_from();
}


@Term
interface TypeIINKTCellSecretingInterleukin4 extends MatureNKTCell {
	public static String id = "CL:0000933";
	public static String name = "type II NK T cell secreting interleukin-4";
	public static String def = "\"A type II NK T cell that has been recently activated, secretes interleukin-4, and has the phenotype CD69-positive and downregulated NK markers.\" [GO_REF:0000031, GOC:add, GOC:pam]";

	@Relates("develops_from")
	public ActivatedTypeIINKTCell TypeIINKTCellSecretingInterleukin4_develops_from();
}


@Term
interface CD4PositiveAlphaBetaCytotoxicTCell extends CytotoxicTCell {
	public static String id = "CL:0000934";
	public static String name = "CD4-positive, alpha-beta cytotoxic T cell";
	public static String def = "\"A CD4-positive, alpha-beta T cell that has cytotoxic function.\" [GO_REF:0000031, GOC:add, GOC:pam]";

	@Relates("develops_from")
	public ActivatedCD4PositiveAlphaBetaTCell CD4PositiveAlphaBetaCytotoxicTCell_develops_from();
}


@Term
interface CD4NegativeCD8NegativeAlphaBetaIntraepithelialTCell extends AlphaBetaIntraepithelialTCell {
	public static String id = "CL:0000935";
	public static String name = "CD4-negative, CD8-negative, alpha-beta intraepithelial T cell";
	public static String def = "\"A CD4-negative, CD8-negative, alpha-beta intraepithelial T cell that is found in the columnar epithelium of the gastrointestinal tract.\" [GO_REF:0000031, GOC:add, GOC:pam]";
}


@Term
interface EarlyLymphoidProgenitor extends LymphoidProgenitorCell {
	public static String id = "CL:0000936";
	public static String name = "early lymphoid progenitor";
	public static String def = "\"A lymphoid progenitor cell that is found in bone marrow, gives rise to B cells, T cells, natural killer cells and dendritic cells, and has the phenotype Lin-negative, CD117-positive, Sca-1-positive, FLT3-positive, and CD34 positive.\" [GO_REF:0000031, GOC:add, GOC:pam]";
}


@Term
interface PreNaturalKillerCell extends NaturalKillerCell {
	public static String id = "CL:0000937";
	public static String name = "pre-natural killer cell";
	public static String def = "\"Cell committed to natural killer cell lineage that has the phenotype CD122-positive, CD34-positive, CD117-positive, and CD161-positive.\" [GO_REF:0000031, GOC:add, GOC:pam]";
}


@Term
interface CD56BrightCytokineSecretingNaturalKillerCell extends MatureNaturalKillerCell {
	public static String id = "CL:0000938";
	public static String name = "CD56-bright cytokine secreting natural killer cell";
	public static String def = "\"NK cell that has the phenotype CD56-bright, CD16-negative, and CD84-positive with the function to secrete interferon-gamma but is not cytotoxic.\" [GO_REF:0000031, GOC:add, GOC:pam]";
}


@Term
interface CytotoxicCD56DimNaturalKillerCell extends MatureNaturalKillerCell {
	public static String id = "CL:0000939";
	public static String name = "cytotoxic CD56-dim natural killer cell";
	public static String def = "\"A mature natural killer cell that has the phenotype CD56-dim abd CD16-positive and is capable of cytotoxic function and cytokine production.\" [GO_REF:0000031, GOC:add, GOC:pam]";
}


@Term
interface MucosalInvariantTCell extends AlphaBetaTCell {
	public static String id = "CL:0000940";
	public static String name = "mucosal invariant T cell";
	public static String def = "\"An alpha-beta T cell that is found in the lamina propria of mucosal tissues and is restricted by the MR-1 molecule.\" [GO_REF:0000031, GOC:add, GOC:pam]";
}


@Term
interface ThymicConventionalDendriticCell extends ConventionalDendriticCell {
	public static String id = "CL:0000941";
	public static String name = "thymic conventional dendritic cell";
	public static String def = "\"A dendritic cell arising in thymus that has the phenotype CD11c-positive, CD11b-negative, and CD45RA-negative.\" [GO_REF:0000031, GOC:add, GOC:pam]";

	@Relates("develops_from")
	public DN1ThymicProTCell ThymicConventionalDendriticCell_develops_from();
}


@Term
interface ThymicPlasmacytoidDendriticCell extends PlasmacytoidDendriticCell {
	public static String id = "CL:0000942";
	public static String name = "thymic plasmacytoid dendritic cell";
	public static String def = "\"A plasmacytoid dendritic cell developing in the thymus with phenotype CD11c-negative or low, CD45RA-positive, CD11b-negative, and CD123-positive.\" [GO_REF:0000031, GOC:add, GOC:pam]";

	@Relates("develops_from")
	public DN1ThymicProTCell ThymicPlasmacytoidDendriticCell_develops_from();
}


@Term
interface Be1Cell extends BeCell {
	public static String id = "CL:0000943";
	public static String name = "Be1 Cell";
	public static String def = "\"A Be cell that facilitates development of T-helper 1 (Th1) phenotype in CD4-positive T cells, and secretes high levels of interleukin-2, tumor necrosis factor-alpha and interferon-gamma.\" [GO_REF:0000031, GOC:msz, PMID:11101868]";
}


@Term
interface Be2Cell extends BeCell {
	public static String id = "CL:0000944";
	public static String name = "Be2 cell";
	public static String def = "\"A Be cell that facilitates development of T-helper 2 (Th2) phenotype T cells, and secretes high levels of interleukin-2, interleukin-10, interleukin-4, and interleukin-6.\" [GO_REF:0000031, GOC:msz, PMID:11101868]";
}


@Term
interface LymphocyteOfBLineage extends Lymphocyte {
	public static String id = "CL:0000945";
	public static String name = "lymphocyte of B lineage";
	public static String def = "\"A lymphocyte of B lineage is a lymphocyte that expresses CD19 (P15391/CD19_HUMAN; PIRSF016630) on the cell surface. An additional defining characteristic is the commitment to express an immunoglobulin complex.\" [GO_REF:0000031, GOC:add, GOC:rhs, ISBN:0781735149]";

	@Relates("develops_from")
	public ProBCell LymphocyteOfBLineage_develops_from();
}


@Term
interface AntibodySecretingCell extends LymphocyteOfBLineage {
	public static String id = "CL:0000946";
	public static String name = "antibody secreting cell";
	public static String def = "\"A lymphocyte of B lineage that is devoted to secreting large amounts of immunoglobulin.\" [GO_REF:0000031, GOC:add, ISBN:0721601464, ISBN:0781735149 \"Fundamental Immunology, 6th ed. (WE Paul, ed) Wolters Kluwer (Philadelphia), 2003. 781735149\"]";
}


@Term
interface IgEPlasmaCell extends LongLivedPlasmaCell {
	public static String id = "CL:0000947";
	public static String name = "IgE plasma cell";
	public static String def = "\"A long lived plasma cell that secretes IgE.\" [GO_REF:0000031, GOC:msz]";
}


@Term
interface IgEMemoryBCell extends ClassSwitchedMemoryBCell {
	public static String id = "CL:0000948";
	public static String name = "IgE memory B cell";
	public static String def = "\"A class switched memory B cell that expresses IgE on the cell surface.\" [GO_REF:0000031, GOC:rhs]";
}


@Term
interface IgDPlasmablast extends Plasmablast {
	public static String id = "CL:0000949";
	public static String name = "IgD plasmablast";
	public static String def = "\"A plasmablast that secretes IgD, and which occur in a small proportion of B cells in the adult.\" [GO_REF:0000031, GOC:msz]";
}


@Term
interface IgEPlasmablast extends Plasmablast {
	public static String id = "CL:0000950";
	public static String name = "IgE plasmablast";
	public static String def = "\"A plasmablast that secretes IgE.\" [GO_REF:0000031, GOC:msz]";
}


@Term
interface IgEShortLivedPlasmaCell extends ShortLivedPlasmaCell {
	public static String id = "CL:0000951";
	public static String name = "IgE short-lived plasma cell";
	public static String def = "\"A short lived plasma cell that secretes IgE.\" [GO_REF:0000031, GOC:msz, ISBN:781735149 \"Fundamental Immunology, 6th ed. (WE Paul, ed) Wolters Kluwer (Philadelphia), 2003.\"]";
}


@Term
interface PreBCRPositiveLargePreBIICell extends LargePreBIICell {
	public static String id = "CL:0000952";
	public static String name = "preBCR-positive large pre-B-II cell";
	public static String def = "\"An preBRC-positive large pre-B-II cell is a large pre-B-II cell that expresses the pre-B cell receptor, composed of surrogate light chain protein (SL), which is composed of VpreB (P12018/VPREB_HUMAN; PIRSF001974), Lambda 5/14.1 (P15814/IGLL1_HUMAN; PIRSF001989), in complex with immunoglobulin mu heavy chain (IgHmu) on the cell surface.\" [GO_REF:0000031, GOC:rhs, PMID:9785673]";
}


@Term
interface PreBCRNegativeLargePreBIICell extends LargePreBIICell {
	public static String id = "CL:0000953";
	public static String name = "preBCR-negative large pre-B-II cell";
	public static String def = "\"An preBRC-negative large pre-B-II cell is a large pre-B-II cell that lacks expression of the pre-B cell receptor, composed of surrogate light chain protein (SL), which is composed of VpreB (P12018/VPREB_HUMAN; PIRSF001974) and Lambda 5/14.1 (P15814/IGLL1_HUMAN; PIRSF001989), in complex with immunoglobulin mu heavy chain (IgHmu), on the cell surface, and lack a DNA rearrangement of immunoglobulin light chain genes.\" [GO_REF:0000031, GOC:rhs, PMID:9785673]";
}


@Term
interface SmallPreBIICell extends PrecursorBCell {
	public static String id = "CL:0000954";
	public static String name = "small pre-B-II cell";
	public static String def = "\"A small pre-B-II cell is a pre-B-II cell that expresses Rag1 (P15918/RAG1_HUMAN), Rag2 (P55895/RAG2_HUMAN; PIRSF015717), lack expression of preBCR and BCR, is not proliferating, and carries a DNA rearrangement of one or more immunoglobulin light chain genes.\" [GO_REF:0000031, GOC:rhs, PMID:9785673]";
}


@Term
interface PreBIICell extends PrecursorBCell {
	public static String id = "CL:0000955";
	public static String name = "pre-B-II cell";
	public static String def = "\"A pre-B-II cell is a precursor B cell that expresses immunoglobulin mu heavy chain (IgHmu+), and lack expression of CD34 (P28906/CD34_HUMAN; PIRSF028749), TdT (P04053/TDT_HUMAN; PIRSF000817), immunoglobulin kappa light chain and immunoglobulin lambda light chain.\" [GO_REF:0000031, GOC:rhs, PMID:9785673]";

	@Relates("develops_from")
	public ProBCell PreBIICell_develops_from();
}


@Term
interface PreBICell extends PrecursorBCell {
	public static String id = "CL:0000956";
	public static String name = "pre-B-I cell";
	public static String def = "\"A pre-B-I cell is a precursor B cell that expresses CD34 (P28906/CD34_HUMAN; PIRSF028749) and surrogate immunoglobulin light chain on the cell surface, VpreB (P12018/VPREB_HUMAN; PIRSF001974), Lambda 5/14.1 (P15814/IGLL1_HUMAN; PIRSF001989), TdT (P04053/TDT_HUMAN; PIRSF000817), Rag1 (P15918/RAG1_HUMAN), Rag2 (P55895/RAG2_HUMAN; PIRSF015717) intracellularly, carries a D-JH DNA rearrangement, and lacks expression of immunglobulin heavy chain protein.\" [GO_REF:0000031, GOC:rhs, PMID:9785673]";
}


@Term
interface LargePreBIICell extends PrecursorBCell {
	public static String id = "CL:0000957";
	public static String name = "large pre-B-II cell";
	public static String def = "\"A large pre-B-II cell is a pre-B-II cell that is proliferating and lacks expression of Rag1 (P15918/RAG1_HUMAN) and Rag2 (P55895/RAG2_HUMAN; PIRSF015717).\" [GO_REF:0000031, GOC:rhs, PMID:9785673]";
}


@Term
interface T1BCell extends TransitionalStageBCell {
	public static String id = "CL:0000958";
	public static String name = "T1 B cell";
	public static String def = "\"A transitional stage B cell that migrates from the bone marrow into the peripheral circulation, and finally to the spleen. This cell type has the phenotype surface IgM-positive, surface IgD-negative, CD21-negative, CD23-negative, and CD62L-negative.\" [GO_REF:0000031, GOC:rhs, PMID:12810111]";
}


@Term
interface T2BCell extends TransitionalStageBCell {
	public static String id = "CL:0000959";
	public static String name = "T2 B cell";
	public static String def = "\"A transitional stage B cell that has the phenotype surface IgM-positive, surface IgD-postive, CD21-positive, CD23-positive, CD62L-negative, and is located in the splenic B follicles.\" [GO_REF:0000031, GOC:msz, PMID:12810111]";

	@Relates("develops_from")
	public T1BCell T2BCell_develops_from();
}


@Term
interface T3BCell extends TransitionalStageBCell {
	public static String id = "CL:0000960";
	public static String name = "T3 B cell";
	public static String def = "\"A transitional stage B cell that expresses surface IgM and IgD, and CD62L. This cell type appears to be an anergic B cell that does not proliferate upon BCR signaling, is found in the spleen and lymph nodes, and has the phenotype surface IgM-positive, surface IgD-positive, CD21-positive, CD23-positive, and CD62L-positive.\" [GO_REF:0000031, GOC:msz, PMID:12810111, PMID:17174121]";

	@Relates("develops_from")
	public T2BCell T3BCell_develops_from();
}


@Term
interface Bm1BCell extends FollicularBCell {
	public static String id = "CL:0000961";
	public static String name = "Bm1 B cell";
	public static String def = "\"A follicular B cell that expresses IgD, but not CD23 or CD38. This naive cell type is activated in the extrafollicular areas through interaction with interdigitating dendritic cells and antigen-specific CD4-positive T cells.\" [GO_REF:0000031, GOC:msz, PMID:17992590, PMID:8006591]";

	@Relates("develops_from")
	public TransitionalStageBCell Bm1BCell_develops_from();
}


@Term
interface Bm2BCell extends FollicularBCell {
	public static String id = "CL:0000962";
	public static String name = "Bm2 B cell";
	public static String def = "\"A follicular B cell that expresses IgD and CD23 and CD38. This naive cell type is activated in the extrafollicular areas via interaction with dendritic cells and antigen specific T cells.\" [GO_REF:0000031, GOC:msz, PMID:17992590, PMID:8006591]";

	@Relates("develops_from")
	public Bm1BCell Bm2BCell_develops_from();
}


@Term
interface Bm3DeltaBCell extends GerminalCenterBCell {
	public static String id = "CL:0000963";
	public static String name = "Bm3-delta B cell";
	public static String def = "\"A germinal center B cell that develops from a Bm3 B cell.\" [GO_REF:0000031, GOC:add, GOC:msz]";

	@Relates("develops_from")
	public Bm3BCell Bm3DeltaBCell_develops_from();
}


@Term
interface Bm2PrimeBCell extends GerminalCenterBCell {
	public static String id = "CL:0000964";
	public static String name = "Bm2' B cell";
	public static String def = "\"A germinal center B cell that founds a germinal center, and has the phenotype IgD-positive, CD38-positivie, and CD23-negative.\" [GO_REF:0000031, GOC:msz, PMID:17992590, PMID:8006591]";

	@Relates("develops_from")
	public Bm2BCell Bm2PrimeBCell_develops_from();
}


@Term
interface Bm3BCell extends GerminalCenterBCell {
	public static String id = "CL:0000965";
	public static String name = "Bm3 B cell";
	public static String def = "\"A germinal center B cell that is rapidly dividing and has the phenotype IgD-negative, CD38-positive, and CD77-positive. Somatic hypermutation of the immunoglobulin V gene region can occur during proliferation of this cell type.\" [GO_REF:0000031, GOC:msz, PMID:8006591]";

	@Relates("develops_from")
	public Bm2PrimeBCell Bm3BCell_develops_from();
}


@Term
interface Bm4BCell extends GerminalCenterBCell {
	public static String id = "CL:0000966";
	public static String name = "Bm4 B cell";
	public static String def = "\"A germinal center B cell that has the phenotype CD77-negative, IgD-negative, and CD38-positive. These cells have undergone somatic mutation of the B cell receptor.\" [GO_REF:0000031, GOC:msz, PMID:8006591]";

	@Relates("develops_from")
	public Bm3DeltaBCell Bm4BCell_develops_from();
}


@Term
interface Bm5BCell extends MemoryBCell {
	public static String id = "CL:0000967";
	public static String name = "Bm5 B cell";
	public static String def = "\"A memory B cell arising in the germinal center that is IgD-negative and has undergone somatic mutation of the variable region of the immunoglobulin heavy and light chain genes.\" [GO_REF:0000031, GOC:msz, PMID:8006591]";

	@Relates("develops_from")
	public Bm4BCell Bm5BCell_develops_from();
}


@Term
interface BeCell extends MatureBCell {
	public static String id = "CL:0000968";
	public static String name = "Be cell";
	public static String def = "\"A mature B cell that produces cytokines that can influence CD4 T cell differentiation.\" [GO_REF:0000031, GOC:msz, PMID:11101868]";
}


@Term
interface RegulatoryBCell extends MatureBCell {
	public static String id = "CL:0000969";
	public static String name = "regulatory B cell";
	public static String def = "\"A mature B cell that has the phenotype CD1b-positive and expresses interleukin-10. This cell type has been associated with suppression of chronic inflammatory responses and T cell responses.\" [GO_REF:0000031, GOC:msz, PMID:11869683]";
}


@Term
interface UnswitchedMemoryBCell extends MemoryBCell {
	public static String id = "CL:0000970";
	public static String name = "unswitched memory B cell";
	public static String def = "\"An unswitched memory B cell is a memory B cell that has the phenotype IgM-positive and/or IgD-positive, CD27-positive, CD138-negative, IgG-negative, IgE-negative, and IgA-negative.\" [GO_REF:0000031, GOC:rhs, ISBN:0781765196 \"Fundamental Immunology (ed. W.E. Paul)\"]";

	@Relates("develops_from")
	public Plasmablast UnswitchedMemoryBCell_develops_from();
}


@Term
interface IgMMemoryBCell extends UnswitchedMemoryBCell {
	public static String id = "CL:0000971";
	public static String name = "IgM memory B cell";
	public static String def = "\"An IgM memory B cell is an unswitched memory B cell with the phenotype IgM-positive and IgD-negative.\" [GO_REF:0000031, GOC:rhs]";
}


@Term
interface ClassSwitchedMemoryBCell extends MemoryBCell {
	public static String id = "CL:0000972";
	public static String name = "class switched memory B cell";
	public static String def = "\"A class switched memory B cell is a memory B cell that has undergone Ig class switching and therefore does not express IgM or IgD on the cell surface. These cells usually express CD27 and either IgG, IgE, or IgA on the cell surface.\" [GO_REF:0000031, GOC:rhs, ISBN:0781765196]";

	@Relates("develops_from")
	public UnswitchedMemoryBCell ClassSwitchedMemoryBCell_develops_from();
}


@Term
interface IgAMemoryBCell extends ClassSwitchedMemoryBCell {
	public static String id = "CL:0000973";
	public static String name = "IgA memory B cell";
	public static String def = "\"A class switched memory B cell that expresses IgA.\" [GO_REF:0000031, GOC:msz]";
}


@Term
interface LongLivedPlasmaCell extends PlasmaCell {
	public static String id = "CL:0000974";
	public static String name = "long lived plasma cell";
	public static String def = "\"A fully differentiated plasma cell that lives for years, as opposed to months, secretes immunoglobulin, and has the phenotype weakly CD19-positive, CD20-negative, CD38-negative, strongly CD138-positive, MHC Class II-negative, surface immunoglobulin-negative, IgD-negative, and strongly CXCR4-positive. The majority of these cells of this type reside in the bone marrow.\" [GO_REF:0000031, GOC:msz, ISBN:9780781765190 \"Fundamental Immunology, 6ed (Paul,ed), 2003\"]";

	@Relates("develops_from")
	public ShortLivedPlasmaCell LongLivedPlasmaCell_develops_from();
}


@Term
interface ShortLivedPlasmaCell extends PlasmaCell {
	public static String id = "CL:0000975";
	public static String name = "short lived plasma cell";
	public static String def = "\"A fully differentiated plasma cell that lives for months.\" [GO_REF:0000031, GOC:msz]";

	@Relates("develops_from")
	public Plasmablast ShortLivedPlasmaCell_develops_from();
}


@Term
interface IgAShortLivedPlasmaCell extends ShortLivedPlasmaCell {
	public static String id = "CL:0000976";
	public static String name = "IgA short lived plasma cell";
	public static String def = "\"A short lived plasma cell that secretes IgA. These cells may be found in the bone marrow as well as in the mucosal immune system.\" [GO_REF:0000031, GOC:msz, ISBN:781735149 \"Fundamental Immunology, 6th ed. (WE Paul, ed) Wolters Kluwer (Philadelphia), 2003. 781735149\"]";
}


@Term
interface IgGShortLivedPlasmaCell extends ShortLivedPlasmaCell {
	public static String id = "CL:0000977";
	public static String name = "IgG short-lived plasma cell";
	public static String def = "\"A short lived plasma cell that secretes IgG.\" [GO_REF:0000031, GOC:msz, IBSN:781735149 \"Fundamental Immunology, 6th ed. (WE Paul, ed) Wolters Kluwer (Philadelphia), 2003.\"]";
}


@Term
interface IgMShortLivedPlasmaCell extends ShortLivedPlasmaCell {
	public static String id = "CL:0000978";
	public static String name = "IgM short lived plasma cell";
	public static String def = "\"A short lived plasma cell that secretes IgM.\" [GO_REF:0000031, GOC:msz, IBSN:781735149 \"Fundamental Immunology, 6th ed. (WE Paul, ed) Wolters Kluwer (Philadelphia), 2003.\"]";
}


@Term
interface IgGMemoryBCell extends ClassSwitchedMemoryBCell {
	public static String id = "CL:0000979";
	public static String name = "IgG memory B cell";
	public static String def = "\"An IgG memory B cell is a class switched memory B cell that has class switched and expresses IgG on the cell surface.\" [GO_REF:0000031, GOC:rhs]";
}


@Term
interface Plasmablast extends AntibodySecretingCell {
	public static String id = "CL:0000980";
	public static String name = "plasmablast";
	public static String def = "\"An activated mature (naive or memory) B cell that is secreting Immunoglobulin, typified by expression of CD27 and CD38 but not CD138.\" [GO_REF:0000031, GOC:msz]";

	@Relates("develops_from")
	public NaiveBCell Plasmablast_develops_from();

	@Relates("develops_from")
	public Bm5BCell Plasmablast_develops_from_1();
}


@Term
interface DoubleNegativeMemoryBCell extends MemoryBCell {
	public static String id = "CL:0000981";
	public static String name = "double negative memory B cell";
	public static String def = "\"A memory B cell with the phenotype IgD-negative and CD27-negative.\" [GO_REF:0000031, GOC:msz]";
}


@Term
interface IgGPlasmablast extends Plasmablast {
	public static String id = "CL:0000982";
	public static String name = "IgG plasmablast";
	public static String def = "\"A plasmablast that secretes IgG.\" [GO_REF:0000031, GOC:msz]";
}


@Term
interface IgMPlasmablast extends Plasmablast {
	public static String id = "CL:0000983";
	public static String name = "IgM plasmablast";
	public static String def = "\"A plasmablast that secretes IgM.\" [GO_REF:0000031, GOC:msz]";
}


@Term
interface IgAPlasmablast extends Plasmablast {
	public static String id = "CL:0000984";
	public static String name = "IgA plasmablast";
	public static String def = "\"A plasmablast that secretes IgA.\" [GO_REF:0000031, GOC:msz]";
}


@Term
interface IgGPlasmaCell extends LongLivedPlasmaCell {
	public static String id = "CL:0000985";
	public static String name = "IgG plasma cell";
	public static String def = "\"A fully differentiated plasma cell that secretes IgG.\" [GO_REF:0000031, GOC:msz, ISBN:781735149 \"Fundamental Immunology, 6th ed. (WE Paul, ed) Wolters Kluwer (Philadelphia), 2003.\"]";
}


@Term
interface IgMPlasmaCell extends LongLivedPlasmaCell {
	public static String id = "CL:0000986";
	public static String name = "IgM plasma cell";
	public static String def = "\"A fully differentiated plasma cell that secretes IgM.\" [GO_REF:0000031, GOC:msz, ISBN:781735149 \"Fundamental Immunology, 6th ed. (WE Paul, ed) Wolters Kluwer (Philadelphia), 2003.\"]";
}


@Term
interface IgAPlasmaCell extends LongLivedPlasmaCell {
	public static String id = "CL:0000987";
	public static String name = "IgA plasma cell";
	public static String def = "\"A fully differentiated plasma cell that secretes IgA.\" [GO_REF:0000031, GOC:msz, ISBN:781735149 \"Fundamental Immunology, 6th ed. (WE Paul, ed) Wolters Kluwer (Philadelphia), 2003.\"]";
}


@Term
interface HematopoieticCell extends Cell {
	public static String id = "CL:0000988";
	public static String name = "hematopoietic cell";
	public static String def = "\"A cell of a hematopoietic lineage.\" [GO_REF:0000031, GOC:add]";
}


@Term
interface CD11cLowPlasmacytoidDendriticCell extends PlasmacytoidDendriticCell {
	public static String id = "CL:0000989";
	public static String name = "CD11c-low plasmacytoid dendritic cell";
	public static String def = "\"CD11c-low plasmacytoid dendritic cell is a leukocyte that has a low plasma membrane amount of CD11c, has plasma membrane part CD45R and GR1 and lacks plasma membrane part CD11b, CD3, CD34, CD56, and CD19.\" [GO_REF:0000031, GOC:amm, PMID:15771572, PMID:17850486]";
}


@Term
interface ConventionalDendriticCell extends DendriticCell {
	public static String id = "CL:0000990";
	public static String name = "conventional dendritic cell";
	public static String def = "\"Conventional dendritic cell is a leukocyte that has a high plasma membrane amount of CD11c and lacks plasma membrane part CD19, CD3, CD34, and CD56.\" [GO_REF:0000031, GOC:amm, PMID:17850486]";
}


@Term
interface CD11cNegativePlasmacytoidDendriticCell extends PlasmacytoidDendriticCell {
	public static String id = "CL:0000991";
	public static String name = "CD11c-negative plasmacytoid dendritic cell";
	public static String def = "\"CD11c-negative plasmacytoid dendritic cell is a leukocyte that lacks plasma membrane part CD11c, CD19, CD3, CD34, and CD56 and has plasma membrane part CD123, CD303, CD45RA, and ILT7.\" [GO_REF:0000031, GOC:amm, PMID:15771572, PMID:17850486]";
}


@Term
interface ImmatureCD11cLowPlasmacytoidDendriticCell extends CD11cLowPlasmacytoidDendriticCell {
	public static String id = "CL:0000992";
	public static String name = "immature CD11c-low plasmacytoid dendritic cell";
	public static String def = "\"Immature CD11c-low plasmacytoid dendritic cell is a CD11c-low plasmacytoid dendritic cell that has a low plasma membrane amount of CD80 and CD86.\" [GO_REF:0000031, GOC:amm, PMID:15771572, PMID:17850486]";

	@Relates("develops_from")
	public CommonDendriticProgenitor ImmatureCD11cLowPlasmacytoidDendriticCell_develops_from();
}


@Term
interface MatureCD11cLowPlasmacytoidDendriticCell extends CD11cLowPlasmacytoidDendriticCell {
	public static String id = "CL:0000993";
	public static String name = "mature CD11c-low plasmacytoid dendritic cell";
	public static String def = "\"A mature CD11c-low plasmacytoid dendritic cell is a CD11c-low plasmacytoid dendritic cell that has plasma membrane part CD83 and has a high plasma membrane amount of CD80, CD86, and MHCII.\" [GO_REF:0000031, GOC:amm, PMID:15771572, PMID:17850486]";
}


@Term
interface ImmatureCD11cNegativePlasmacytoidDendriticCell extends CD11cNegativePlasmacytoidDendriticCell {
	public static String id = "CL:0000994";
	public static String name = "immature CD11c-negative plasmacytoid dendritic cell";
	public static String def = "\"Immature CD11c-negative plasmacytoid dendritic cell is a CD11c-negative plasmacytoid dendritic cell that lacks plasma membrane part CD80 and has a low plasma membrane amount of CD86 and MHCII.\" [GO_REF:0000031, GOC:amm, PMID:15771572, PMID:17850486]";

	@Relates("develops_from")
	public CD71PositiveCommonMyeloidProgenitorORCD7NegativeLymphoidProgenitorORCD7PositiveLymphoidProgenitor ImmatureCD11cNegativePlasmacytoidDendriticCell_develops_from();
}


@Term
interface CD71PositiveCommonMyeloidProgenitorORCD7NegativeLymphoidProgenitorORCD7PositiveLymphoidProgenitor extends HematopoieticProgenitorCell {
	public static String id = "CL:0000995";
	public static String name = "CD71-positive common myeloid progenitor OR CD7-negative lymphoid progenitor OR CD7-positive lymphoid progenitor";
	public static String def = "";
}


@Term
interface MatureCD11cNegativePlasmacytoidDendriticCell extends CD11cNegativePlasmacytoidDendriticCell {
	public static String id = "CL:0000996";
	public static String name = "mature CD11c-negative plasmacytoid dendritic cell";
	public static String def = "\"Mature CD11c-negative plasmacytoid dendritic cell is a CD11c-negative plasmacytoid dendritic cell that has a high plasma membrane amount of CD80, CD86, and MHCII and has plasma membrane part CD83,\" [GO_REF:0000031, GOC:amm, PMID:15771572, PMID:17850486]";
}


@Term
interface ImmatureCD8_alphaNegativeCD11bPositiveDendriticCell extends CD8_alphaNegativeCD11bPositiveDendriticCell {
	public static String id = "CL:0000997";
	public static String name = "immature CD8_alpha-negative CD11b-positive dendritic cell";
	public static String def = "\"Immature CD8_alpha-negative CD11b-positive dendritic cell is a CD8_alpha-negative CD11b-positive dendritic cell that has a low plasma membrane amount of CD80, CD86, and MHCII.\" [GO_REF:0000031, GOC:amm, PMID:18082389]";

	@Relates("develops_from")
	public CommonDendriticProgenitor ImmatureCD8_alphaNegativeCD11bPositiveDendriticCell_develops_from();
}


@Term
interface CD8_alphaNegativeCD11bNegativeDendriticCell extends ConventionalDendriticCell {
	public static String id = "CL:0000998";
	public static String name = "CD8_alpha-negative CD11b-negative dendritic cell";
	public static String def = "\"CD8_alpha-negative CD11b-negative dendritic cell is a conventional dendritic cell that lacks plasma membrane part CD11b, CD4 and CD8_alpha and has plasma membrane part CD205.\" [GO_REF:0000031, GOC:amm, PMID:18082389]";
}


@Term
interface CD8_alphaNegativeCD11bPositiveDendriticCell extends ConventionalDendriticCell {
	public static String id = "CL:0000999";
	public static String name = "CD8_alpha-negative CD11b-positive dendritic cell";
	public static String def = "\"CD8_alpha-negative CD11b-positive dendritic cell is a conventional dendritic cell that has plasma membrane part CD11b and CD4 and lacks plasma membrane part CD205 and CD8_alpha.\" [GO_REF:0000031, GOC:amm, PMID:18082389]";
}


@Term
interface CD8_alphaPositiveCD11bNegativeDendriticCell extends ConventionalDendriticCell {
	public static String id = "CL:0001000";
	public static String name = "CD8_alpha-positive CD11b-negative dendritic cell";
	public static String def = "\"CD8_alpha-positive CD11b-negative dendritic cell is a conventional dendritic cell that lacks plasma membrane part CD11b and CD4 and has plasma membrane part CD205 and CD8_alpha.\" [GO_REF:0000031, GOC:amm, PMID:18082389]";
}


@Term
interface ImmatureCD8_alphaNegativeCD11bNegativeDendriticCell extends CD8_alphaNegativeCD11bNegativeDendriticCell {
	public static String id = "CL:0001001";
	public static String name = "immature CD8_alpha-negative CD11b-negative dendritic cell";
	public static String def = "\"Immature CD8_alpha-negative CD11b-negative dendritic cell is a CD8_alpha-negative CD11b-negative dendritic cell that has a low plasma membrane amount of CD80, CD86, and MHCII.\" [GO_REF:0000031, GOC:amm, PMID:18082389]";

	@Relates("develops_from")
	public CommonDendriticProgenitor ImmatureCD8_alphaNegativeCD11bNegativeDendriticCell_develops_from();
}


@Term
interface MatureCD8_alphaNegativeCD11bNegativeDendriticCell extends CD8_alphaNegativeCD11bNegativeDendriticCell {
	public static String id = "CL:0001002";
	public static String name = "mature CD8_alpha-negative CD11b-negative dendritic cell";
	public static String def = "\"Mature CD8_alpha-negative CD11b-negative dendritic cell is a CD8_alpha-negative CD11b-negative dendritic cell that has a high plasma membrane amount of CD80, CD86, and MHCII and has plasma membrane part CD83.\" [GO_REF:0000031, GOC:amm, PMID:18082389]";
}


@Term
interface MatureCD8_alphaNegativeCD11bPositiveDendriticCell extends CD8_alphaNegativeCD11bPositiveDendriticCell {
	public static String id = "CL:0001003";
	public static String name = "mature CD8_alpha-negative CD11b-positive dendritic cell";
	public static String def = "\"Mature CD8_alpha-negative CD11b-positive dendritic cell is a CD8_alpha-negative CD11b-positive dendritic cell that has a high plasma membrane amount of CD80, CD86, and MHCII and has plasma membrane part CD83.\" [GO_REF:0000031, GOC:amm, PMID:18082389]";
}


@Term
interface ImmatureCD8_alphaPositiveCD11bNegativeDendriticCell extends CD8_alphaPositiveCD11bNegativeDendriticCell {
	public static String id = "CL:0001004";
	public static String name = "immature CD8_alpha-positive CD11b-negative dendritic cell";
	public static String def = "\"Immature CD8_alpha-positive CD11b-negative dendritic cell is a CD8_alpha-positive CD11b-negative dendritic cell that has a low plasma membrane amount of CD80, CD86, and MHCII.\" [GO_REF:0000031, GOC:amm, PMID:18082389]";

	@Relates("develops_from")
	public CommonDendriticProgenitor ImmatureCD8_alphaPositiveCD11bNegativeDendriticCell_develops_from();
}


@Term
interface MatureCD8_alphaPositiveCD11bNegativeDendriticCell extends CD8_alphaPositiveCD11bNegativeDendriticCell {
	public static String id = "CL:0001005";
	public static String name = "mature CD8_alpha-positive CD11b-negative dendritic cell";
	public static String def = "\"Mature CD8_alpha-positive CD11b-negative dendritic cell is a CD8_alpha-positive CD11b-negative dendritic cell that has a high plasma membrane amount of CD80, CD86, and MHCII and has plasma membrane part CD83.\" [GO_REF:0000031, GOC:amm, PMID:18082389]";
}


@Term
interface DermalDendriticCell extends ConventionalDendriticCell {
	public static String id = "CL:0001006";
	public static String name = "dermal dendritic cell";
	public static String def = "\"Dermal dendritic cell is a conventional dendritic cell that has plasma membrane part CD11b and CD205 and lacks plasma membrane part CD8_alpha.\" [GO_REF:0000031, GOC:amm, PMID:18082389]";
}


@Term
interface InterstitialDendriticCell extends ConventionalDendriticCell {
	public static String id = "CL:0001007";
	public static String name = "interstitial dendritic cell";
	public static String def = "\"Interstitial dendritic cell is a conventional dendritic cell that has plasma membrane part CD11b, CD1a, CD206, CD209, and CD36.\" [GO_REF:0000031, GOC:amm, PMID:17850486]";
}


@Term
interface SCA1PositiveHematopoieticStemCell extends HematopoieticStemCell {
	public static String id = "CL:0001008";
	public static String name = "SCA1-positive hematopoietic stem cell";
	public static String def = "\"SCA1-positive hematopoietic stem cell is a hematopoietic stem cell that has plasma membrane part CD117 and SCA1 and lacks plasma membrane part CD2, CD3, C34, CD4, CD45R, CD5, CD8, CD90,GR1, NK1.1, Ter-119.\" [GO_REF:0000031, GOC:add, GOC:amm, PMID:17952047]";
}


@Term
interface ImmatureDermalDendriticCell extends DermalDendriticCell {
	public static String id = "CL:0001009";
	public static String name = "immature dermal dendritic cell";
	public static String def = "\"Immature dermal dendritic cell is a dermal dendritic cell that has a low plasma membrane amount of CD80, CD86, and MHCII.\" [GO_REF:0000031, GOC:amm, PMID:18082389]";

	@Relates("develops_from")
	public CommonDendriticProgenitor ImmatureDermalDendriticCell_develops_from();
}


@Term
interface MatureDermalDendriticCell extends DermalDendriticCell {
	public static String id = "CL:0001010";
	public static String name = "mature dermal dendritic cell";
	public static String def = "\"Mature dermal dendritic cell is a dermal dendritic cell that has a high plasma membrane amount of CD80, CD86, and MHCII and has plasma membrane part CD83.\" [GO_REF:0000031, GOC:amm, PMID:18082389]";
}


@Term
interface ImmatureInterstitialDendriticCell extends InterstitialDendriticCell {
	public static String id = "CL:0001011";
	public static String name = "immature interstitial dendritic cell";
	public static String def = "\"Immature interstitial dendritic cell is a interstitial dendritic cell that has a low plasma membrane amount of CD80, CD86, and MHCII.\" [GO_REF:0000031, GOC:amm, PMID:17850486]";

	@Relates("develops_from")
	public CD7NegativeLymphoidProgenitorORGranulocyteMonocyteProgenitor ImmatureInterstitialDendriticCell_develops_from();
}


@Term
interface CD7NegativeLymphoidProgenitorORGranulocyteMonocyteProgenitor extends HematopoieticProgenitorCell {
	public static String id = "CL:0001012";
	public static String name = "CD7-negative lymphoid progenitor OR granulocyte monocyte progenitor";
	public static String def = "";
}


@Term
interface MatureInterstitialDendriticCell extends InterstitialDendriticCell {
	public static String id = "CL:0001013";
	public static String name = "mature interstitial dendritic cell";
	public static String def = "\"Mature interstitial dendritic cell is a interstitial dendritic cell that has a high plasma membrane amount of CD80, CD86, and MHCII and has plasma membrane part CD83.\" [GO_REF:0000031, GOC:amm, PMID:17850486]";
}


@Term
interface CD1aPositiveLangerhansCell extends LangerhansCell {
	public static String id = "CL:0001014";
	public static String name = "CD1a-positive Langerhans cell";
	public static String def = "\"CD1a-positive Langerhans cell is a Langerhans_cell that has plasma membrane part CD1a and CD324.\" [GO_REF:0000031, GOC:amm, PMID:17850486]";
}


@Term
interface CD8_alphaLowLangerhansCell extends LangerhansCell {
	public static String id = "CL:0001015";
	public static String name = "CD8_alpha-low Langerhans cell";
	public static String def = "\"CD8_alpha-low Langerhans cell is a Langerhans cell that has a high plasma membrane amount of CD205 and has a low plasma membrane amount of CD8_alpha.\" [GO_REF:0000031, GOC:amm, PMID:18082389]";
}


@Term
interface ImmatureCD1aPositiveLangerhansCell extends CD1aPositiveLangerhansCell {
	public static String id = "CL:0001016";
	public static String name = "immature CD1a-positive Langerhans cell";
	public static String def = "\"Immature CD1a-positive Langerhans cell is a CD1a-positive Langerhans cell that has a low plasma membrane amount of CD80, CD86, and MHCII.\" [GO_REF:0000031, GOC:amm, PMID:17850486]";
}


@Term
interface MatureCD1aPositiveLangerhansCell extends CD1aPositiveLangerhansCell {
	public static String id = "CL:0001017";
	public static String name = "mature CD1a-positive Langerhans cell";
	public static String def = "\"Mature CD1a-positive Langerhans cell is a CD1a-positive Langerhans cell that has a high plasma membrane amount of CD80, CD86, and MHCII and has plasma membrane part CD83.\" [GO_REF:0000031, GOC:amm, PMID:17850486]";
}


@Term
interface ImmatureCD8_alphaLowLangerhansCell extends CD8_alphaLowLangerhansCell {
	public static String id = "CL:0001018";
	public static String name = "immature CD8_alpha-low Langerhans cell";
	public static String def = "\"Immature CD8_alpha-low Langerhans cell is a CD8_alpha-low Langerhans cell that has a low plasma membrane amount of CD80, CD86, and MHCII.\" [GO_REF:0000031, GOC:amm, PMID:18082389]";

	@Relates("develops_from")
	public CD115PositiveMonocyteORCommonDendriticProgenitor ImmatureCD8_alphaLowLangerhansCell_develops_from();
}


@Term
interface CD115PositiveMonocyteORCommonDendriticProgenitor extends HematopoieticProgenitorCell {
	public static String id = "CL:0001019";
	public static String name = "CD115-positive monocyte OR common dendritic progenitor";
	public static String def = "";
}


@Term
interface MatureCD8_alphaLowLangerhansCell extends CD8_alphaLowLangerhansCell {
	public static String id = "CL:0001020";
	public static String name = "mature CD8_alpha-low Langerhans cell";
	public static String def = "\"Mature CD8_alpha-low Langerhans cell is a CD8_alpha-low Langerhans cell that has a high plasma membrane amount of CD80, CD86, and MHCII and has plasma membrane part CD83.\" [GO_REF:0000031, GOC:amm, PMID:18082389]";
}


@Term
interface CD10PositiveCommonLymphoidProgenitor extends CommonLymphoidProgenitor {
	public static String id = "CL:0001021";
	public static String name = "CD10-positive common lymphoid progenitor";
	public static String def = "\"CD10-positive common lymphoid progenitor is a common lymphoid progenitor that has plasma membrane part CD10, CD45RA, and CD34 and lacks plasma membrane part CD19, CD3, and CD4.\" [GO_REF:0000031, GOC:add, GOC:amm, PMID:18082389]";

	@Relates("develops_from")
	public CD133PositiveHematopoieticStemCell CD10PositiveCommonLymphoidProgenitor_develops_from();
}


@Term
interface CD115PositiveMonocyte extends Monocyte {
	public static String id = "CL:0001022";
	public static String name = "CD115-positive monocyte";
	public static String def = "\"CD115-positive monocyte is a monocyte that has plasma membrane part CD115 and CD11b.\" [GO_REF:0000031, GOC:add, GOC:amm, PMID:17952047]";

	@Relates("develops_from")
	public CD117PositiveCommonMyeloidProgenitor CD115PositiveMonocyte_develops_from();
}


@Term
interface CD117PositiveCommonMyeloidProgenitor extends CommonMyeloidProgenitor {
	public static String id = "CL:0001023";
	public static String name = "CD117-positive common myeloid progenitor";
	public static String def = "\"CD117-positive common myeloid progenitor is a common myeloid progenitor that has plasma membrane part CD117 and CD34 and lacks plasma membrane part CD2, CD217, CD3, CD4, CD45R, CD5, CD8, GR1, NK1.1, SCA1, and Ter-119.\" [GO_REF:0000031, GOC:add, GOC:amm, PMID:17952047]";

	@Relates("develops_from")
	public SCA1PositiveHematopoieticStemCell CD117PositiveCommonMyeloidProgenitor_develops_from();
}


@Term
interface CD133PositiveHematopoieticStemCell extends HematopoieticStemCell {
	public static String id = "CL:0001024";
	public static String name = "CD133-positive hematopoietic stem cell";
	public static String def = "\"CD133-positive hematopoietic stem cell is a hematopoietic stem cell that has plasma membrane part CD133 and CD34 and lacks plasma membrane part CD11b, CD15, CD16, CD19, CD2, CD3, CD33, CD56, and CD71.\" [GO_REF:0000031, GOC:add, GOC:amm, PMID:16551251]";
}


@Term
interface CD217PositiveCommonLymphoidProgenitor extends CommonLymphoidProgenitor {
	public static String id = "CL:0001025";
	public static String name = "CD217-positive common lymphoid progenitor";
	public static String def = "\"CD217-positive common lymphoid progenitor is a common lymphoid progenitor that has plasma membrane part CD117, CD217, SCA1 and lacks plasma membrane part CD2, CD3, CD4, CD45R, CD5, GR1, CD8, NK1.1, Ter-119.\" [GO_REF:0000031, GOC:add, GOC:amm, PMID:17952047]";

	@Relates("develops_from")
	public SCA1PositiveHematopoieticStemCell CD217PositiveCommonLymphoidProgenitor_develops_from();
}


@Term
interface CD71PositiveCommonMyeloidProgenitor extends CommonMyeloidProgenitor {
	public static String id = "CL:0001026";
	public static String name = "CD71-positive common myeloid progenitor";
	public static String def = "\"CD71-positive common myeloid progenitor is a common myeloid progenitor that has plasma membrane part CD34, CD45RA, and CD71 and lacks plasma membrane part CD10, CD19, CD3, CD4, and CD7.\" [GO_REF:0000031, GOC:add, GOC:amm, PMID:16551251]";

	@Relates("develops_from")
	public CD133PositiveHematopoieticStemCell CD71PositiveCommonMyeloidProgenitor_develops_from();
}


@Term
interface CD7NegativeLymphoidProgenitorCell extends LymphoidProgenitorCell {
	public static String id = "CL:0001027";
	public static String name = "CD7-negative lymphoid progenitor cell";
	public static String def = "\"CD7-negative lymphoid progenitor cell is a lymphoid progenitor cell that has plasma membrane part CD34 and lacks plasma membrane part CD19, CD3, CD4, CD45RA, and CD7.\" [GO_REF:0000031, GOC:amm, PMID:16551251]";

	@Relates("develops_from")
	public CD10PositiveCommonLymphoidProgenitor CD7NegativeLymphoidProgenitorCell_develops_from();
}


@Term
interface CD7PositiveLymphoidProgenitorCell extends LymphoidProgenitorCell {
	public static String id = "CL:0001028";
	public static String name = "CD7-positive lymphoid progenitor cell";
	public static String def = "\"CD7-positive lymphoid progenitor cell is a lymphoid progenitor cell that has plasma membrane part CD34 and CD7 and lacks plasma membrane part CD19, CD3, CD4, CD45RA.\" [GO_REF:0000031, GOC:amm, PMID:16551251]";

	@Relates("develops_from")
	public CD10PositiveCommonLymphoidProgenitor CD7PositiveLymphoidProgenitorCell_develops_from();
}


@Term
interface CommonDendriticProgenitor extends HematopoieticProgenitorCell {
	public static String id = "CL:0001029";
	public static String name = "common dendritic progenitor";
	public static String def = "\"Common dendritic precursor is a hematopoietic progenitor cell that has plasma membrane part CD117, CD135, and M-CSFR.\" [GO_REF:0000031, GOC:amm, PMID:16551251]";

	@Relates("develops_from")
	public CD117PositiveCommonMyeloidProgenitorORCD217PositiveCommonLymphoidProgenitor CommonDendriticProgenitor_develops_from();
}


@Term
interface CD117PositiveCommonMyeloidProgenitorORCD217PositiveCommonLymphoidProgenitor extends HematopoieticProgenitorCell {
	public static String id = "CL:0001030";
	public static String name = "CD117-positive common myeloid progenitor OR CD217-positive common lymphoid progenitor";
	public static String def = "";
}


@Term
interface CerebellarGranuleCell extends GranuleCell {
	public static String id = "CL:0001031";
	public static String name = "cerebellar granule cell";
	public static String def = "\"Granule cell that is part of the cerebellum.\" [GOC:mah]";
}


@Term
interface CorticalGranuleCell extends GranuleCell {
	public static String id = "CL:0001032";
	public static String name = "cortical granule cell";
	public static String def = "\"Granule cell that is part of the cerebral cortex.\" [GOC:mah]";
}


@Term
interface HippocampalGranuleCell extends GranuleCell {
	public static String id = "CL:0001033";
	public static String name = "hippocampal granule cell";
	public static String def = "\"Granule cell that is part of the hippocampus.\" [GOC:mah]";
}


@Term
interface VisualPigmentCellSensuNematodaAndProtostomia extends VisualPigmentCell, PigmentCellSensuNematodaAndProtostomia {
	public static String id = "CL:0001658";
	public static String name = "visual pigment cell (sensu Nematoda and Protostomia)";
	public static String def = "";
}


@Term
interface SpinalCordInterneuron extends CNSInterneuron {
	public static String id = "CL:0005000";
	public static String name = "spinal cord interneuron";
	public static String def = "\"A CNS interneuron located in the spinal cord.\" [CL:CVS]";
}


@Term
interface Iridoblast extends NonTerminallyDifferentiatedCell {
	public static String id = "CL:0005001";
	public static String name = "iridoblast";
	public static String def = "\"A non-terminally differentiated cell that originates from the neural crest and differentiates into an iridophore.\" [CL:CVS]";

	@Relates("develops_from")
	public NeuralCrestCell Iridoblast_develops_from();
}


@Term
interface Xanthoblast extends NonTerminallyDifferentiatedCell {
	public static String id = "CL:0005002";
	public static String name = "xanthoblast";
	public static String def = "\"A non-terminally differentiated cell that differentiates into a xanthophore.\" [CL:CVS]";

	@Relates("develops_from")
	public NeuralCrestCell Xanthoblast_develops_from();
}


@Term
interface Leucoblast extends NonTerminallyDifferentiatedCell {
	public static String id = "CL:0005003";
	public static String name = "leucoblast";
	public static String def = "\"A non-terminally differentiated cell that originates from the neural crest and differentiates into a leucophore.\" [CL:CVS]";

	@Relates("develops_from")
	public NeuralCrestCell Leucoblast_develops_from();
}


@Term
interface PigmentErythroblast extends NonTerminallyDifferentiatedCell {
	public static String id = "CL:0005004";
	public static String name = "pigment erythroblast";
	public static String def = "\"A non-terminally differentiated cell that originates from the neural crest and differentiates into an erythrophore.\" [CL:CVS]";

	@Relates("develops_from")
	public NeuralCrestCell PigmentErythroblast_develops_from();
}


@Term
interface Cyanoblast extends NonTerminallyDifferentiatedCell {
	public static String id = "CL:0005005";
	public static String name = "cyanoblast";
	public static String def = "\"A non-terminally differentiated cell that originates from the neural crest and differentiates into a cyanophore.\" [CL:CVS]";

	@Relates("develops_from")
	public NeuralCrestCell Cyanoblast_develops_from();
}


@Term
interface Ionocyte extends EpithelialCell {
	public static String id = "CL:0005006";
	public static String name = "ionocyte";
	public static String def = "\"Specialized epithelial cells involved in the maintenance of osmotic homeostasis. They are characterized by abundant mitochondria and ion transporters. In amniotes, they are present in the renal system. In freshwater fish, ionocytes in the skin and gills help maintain osmotic homeostasis by absorbing salt from the external environment.\" [PMID:17555741, PMID:19268451]";
}


@Term
interface KolmerAgduhrNeuron extends GABAergicNeuron, SpinalCordInterneuron {
	public static String id = "CL:0005007";
	public static String name = "Kolmer-Agduhr neuron";
	public static String def = "\"Kolmer-Agduhr neurons are ciliated GABAergic neurons that contact the central canal of the spinal cord and have ipsilateral ascending axons.\" [PMID:18680739]";
}


@Term
interface MacularHairCell extends AuditoryHairCell {
	public static String id = "CL:0005008";
	public static String name = "macular hair cell";
	public static String def = "\"An auditory hair cell located in the macula that is sensitive to auditory stimuli.\" [CL:CVS]";
}


@Term
interface RenalPrincipalCell extends ColumnarCuboidalEpithelialCell {
	public static String id = "CL:0005009";
	public static String name = "renal principal cell";
	public static String def = "\"A cuboidal epithelial cell of the kidney which regulates sodium and potassium balance. The activity of sodium and potassium channels on the cells apical membrane is regulated by aldosterone and vasopressin. In mammals these cells are located in the renal collecting ducts.\" [CL:CVS]";
}


@Term
interface RenalIntercalatedCell extends ColumnarCuboidalEpithelialCell {
	public static String id = "CL:0005010";
	public static String name = "renal intercalated cell";
	public static String def = "\"A cuboidal epithelial cell of the kidney that regulates acid/base balance.\" [CL:CVS]";
}


@Term
interface RenalAlphaIntercalatedCell extends RenalIntercalatedCell {
	public static String id = "CL:0005011";
	public static String name = "renal alpha-intercalated cell";
	public static String def = "\"A cuboidal epithelial cell of the kidney which secretes acid and reabsorbs base to regulate acid/base balance.\" [CL:CVS]";
}


@Term
interface MultiCiliatedEpithelialCell extends CiliatedEpithelialCell {
	public static String id = "CL:0005012";
	public static String name = "multi-ciliated epithelial cell";
	public static String def = "\"A ciliated epithelial cell with many cilium.\" [CL:CVS]";
}


@Term
interface SingleCiliatedEpithelialCell extends CiliatedEpithelialCell {
	public static String id = "CL:0005013";
	public static String name = "single ciliated epithelial cell";
	public static String def = "\"A ciliated epithelial cell with a single cilium.\" [CL:CVS]";
}


@Term
interface AuditoryEpithelialSupportCell extends EpithelialCell, SupportiveCell {
	public static String id = "CL:0005014";
	public static String name = "auditory epithelial support cell";
	public static String def = "\"A non-sensory cell that extends from the basement membrane to the apical surface of the auditory epithelium and provides support for auditory hair cells.\" [CL:CVS]";
}


@Term
interface InnerPhalangealCell extends AuditoryEpithelialSupportCell {
	public static String id = "CL:0005015";
	public static String name = "inner phalangeal cell";
	public static String def = "\"An auditory epithelial support cell that surrounds the nerve fibers and synapses of the auditory inner hair cells.\" [CL:CVS]";
}


@Term
interface ApicalCell extends PlantCell {
	public static String id = "CL:0005016";
	public static String name = "apical cell";
	public static String def = "\"The apical cell is the upper cell formed after the first division of a plant zygote.\" [TAIR:TB]";
}


@Term
interface PlantBasalCell extends PlantCell {
	public static String id = "CL:0005017";
	public static String name = "plant basal cell";
	public static String def = "\"The lower cell formed after the first division of a plant zygote.\" [TAIR:TB]";
}


@Term
interface GhrelinSecretingCell extends PeptideHormoneSecretingCell {
	public static String id = "CL:0005018";
	public static String name = "ghrelin secreting cell";
	public static String def = "\"A cell that secretes ghrelin, the peptide hormone that stimulates hunger.\" [CL:curator]";
}


@Term
interface PancreaticEpsilonCell extends GhrelinSecretingCell {
	public static String id = "CL:0005019";
	public static String name = "pancreatic epsilon cell";
	public static String def = "\"Ghrelin secreting cells found in the endocrine pancreas.\" [PMID:14970313]";
}


@Term
interface HepaticOvalCell extends EpithelialFateStemCell {
	public static String id = "CL:1000036";
	public static String name = "hepatic oval cell";
	public static String def = "";
}


@Term
interface StretchReceptorCell extends ReceptorCellSensuAnimalia {
	public static String id = "CL:1000082";
	public static String name = "stretch receptor cell";
	public static String def = "";
}


@Term
interface StratifiedKeratinizedEpithelialStemCell extends StratifiedEpithelialStemCell {
	public static String id = "CL:1000083";
	public static String name = "stratified keratinized epithelial stem cell";
	public static String def = "";
}


@Term
interface StratifiedNonKeratinizedEpithelialStemCell extends StratifiedEpithelialStemCell {
	public static String id = "CL:1000085";
	public static String name = "stratified non keratinized epithelial stem cell";
	public static String def = "";
}


@Term
interface PillarCell extends ColumnarCuboidalEpithelialCell {
	public static String id = "CL:1000191";
	public static String name = "pillar cell";
	public static String def = "\"A cell that lines the tunnel of Corti in the mammalian cochlea. The tunnel of Corti lies between the single row of inner hair cells and the first row of outer hair cells.\" [PMID:12417662]";
}


@Term
interface TrophectodermalCell extends ExtraembryonicCell {
	public static String id = "CL:1000274";
	public static String name = "trophectodermal cell";
	public static String def = "";
}


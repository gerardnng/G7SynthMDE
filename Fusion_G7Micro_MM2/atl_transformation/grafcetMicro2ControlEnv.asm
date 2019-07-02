<?xml version = '1.0' encoding = 'ISO-8859-1' ?>
<asm version="1.0" name="0">
	<cp>
		<constant value="grafcetMicro2ControlEnv"/>
		<constant value="links"/>
		<constant value="NTransientLinkSet;"/>
		<constant value="col"/>
		<constant value="J"/>
		<constant value="main"/>
		<constant value="A"/>
		<constant value="OclParametrizedType"/>
		<constant value="#native"/>
		<constant value="Collection"/>
		<constant value="J.setName(S):V"/>
		<constant value="OclSimpleType"/>
		<constant value="OclAny"/>
		<constant value="J.setElementType(J):V"/>
		<constant value="TransientLinkSet"/>
		<constant value="A.__matcher__():V"/>
		<constant value="A.__exec__():V"/>
		<constant value="self"/>
		<constant value="__resolve__"/>
		<constant value="1"/>
		<constant value="J.oclIsKindOf(J):B"/>
		<constant value="18"/>
		<constant value="NTransientLinkSet;.getLinkBySourceElement(S):QNTransientLink;"/>
		<constant value="J.oclIsUndefined():B"/>
		<constant value="15"/>
		<constant value="NTransientLink;.getTargetFromSource(J):J"/>
		<constant value="17"/>
		<constant value="30"/>
		<constant value="Sequence"/>
		<constant value="2"/>
		<constant value="A.__resolve__(J):J"/>
		<constant value="QJ.including(J):QJ"/>
		<constant value="QJ.flatten():QJ"/>
		<constant value="e"/>
		<constant value="value"/>
		<constant value="resolveTemp"/>
		<constant value="S"/>
		<constant value="NTransientLink;.getNamedTargetFromSource(JS):J"/>
		<constant value="name"/>
		<constant value="__matcher__"/>
		<constant value="A.__matchcreateContrSynthEnv():V"/>
		<constant value="A.__matchg7_2_g7():V"/>
		<constant value="__exec__"/>
		<constant value="createContrSynthEnv"/>
		<constant value="NTransientLinkSet;.getLinksByRule(S):QNTransientLink;"/>
		<constant value="A.__applycreateContrSynthEnv(NTransientLink;):V"/>
		<constant value="g7_2_g7"/>
		<constant value="A.__applyg7_2_g7(NTransientLink;):V"/>
		<constant value="__matchcreateContrSynthEnv"/>
		<constant value="Grafcet"/>
		<constant value="IN"/>
		<constant value="MMOF!Classifier;.allInstancesFrom(S):QJ"/>
		<constant value="Microcontroller"/>
		<constant value="IN1"/>
		<constant value="TransientLink"/>
		<constant value="NTransientLink;.setRule(MATL!Rule;):V"/>
		<constant value="g7"/>
		<constant value="NTransientLink;.addSourceElement(SJ):V"/>
		<constant value="micro"/>
		<constant value="csEnv"/>
		<constant value="ControllerSynthesisEnv"/>
		<constant value="ContrSynthEnv"/>
		<constant value="NTransientLink;.addTargetElement(SJ):V"/>
		<constant value="NTransientLinkSet;.addLink2(NTransientLink;B):V"/>
		<constant value="10:5-14:3"/>
		<constant value="__applycreateContrSynthEnv"/>
		<constant value="NTransientLink;"/>
		<constant value="NTransientLink;.getSourceElement(S):J"/>
		<constant value="3"/>
		<constant value="NTransientLink;.getTargetElement(S):J"/>
		<constant value="4"/>
		<constant value="_"/>
		<constant value="J.+(J):J"/>
		<constant value="grafcet"/>
		<constant value="microcontroller"/>
		<constant value="11:11-11:13"/>
		<constant value="11:11-11:18"/>
		<constant value="11:21-11:24"/>
		<constant value="11:11-11:24"/>
		<constant value="11:27-11:32"/>
		<constant value="11:27-11:37"/>
		<constant value="11:11-11:37"/>
		<constant value="11:3-11:37"/>
		<constant value="12:14-12:16"/>
		<constant value="12:3-12:16"/>
		<constant value="13:22-13:27"/>
		<constant value="13:3-13:27"/>
		<constant value="link"/>
		<constant value="__matchg7_2_g7"/>
		<constant value="19:5-21:3"/>
		<constant value="__applyg7_2_g7"/>
	</cp>
	<field name="1" type="2"/>
	<field name="3" type="4"/>
	<operation name="5">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<push arg="7"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="9"/>
			<pcall arg="10"/>
			<dup/>
			<push arg="11"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="12"/>
			<pcall arg="10"/>
			<pcall arg="13"/>
			<set arg="3"/>
			<getasm/>
			<push arg="14"/>
			<push arg="8"/>
			<new/>
			<set arg="1"/>
			<getasm/>
			<pcall arg="15"/>
			<getasm/>
			<pcall arg="16"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="24"/>
		</localvariabletable>
	</operation>
	<operation name="18">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
		</parameters>
		<code>
			<load arg="19"/>
			<getasm/>
			<get arg="3"/>
			<call arg="20"/>
			<if arg="21"/>
			<getasm/>
			<get arg="1"/>
			<load arg="19"/>
			<call arg="22"/>
			<dup/>
			<call arg="23"/>
			<if arg="24"/>
			<load arg="19"/>
			<call arg="25"/>
			<goto arg="26"/>
			<pop/>
			<load arg="19"/>
			<goto arg="27"/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<load arg="19"/>
			<iterate/>
			<store arg="29"/>
			<getasm/>
			<load arg="29"/>
			<call arg="30"/>
			<call arg="31"/>
			<enditerate/>
			<call arg="32"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="33" begin="23" end="27"/>
			<lve slot="0" name="17" begin="0" end="29"/>
			<lve slot="1" name="34" begin="0" end="29"/>
		</localvariabletable>
	</operation>
	<operation name="35">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
			<parameter name="29" type="36"/>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<load arg="19"/>
			<call arg="22"/>
			<load arg="19"/>
			<load arg="29"/>
			<call arg="37"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="6"/>
			<lve slot="1" name="34" begin="0" end="6"/>
			<lve slot="2" name="38" begin="0" end="6"/>
		</localvariabletable>
	</operation>
	<operation name="39">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<pcall arg="40"/>
			<getasm/>
			<pcall arg="41"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="3"/>
		</localvariabletable>
	</operation>
	<operation name="42">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<push arg="43"/>
			<call arg="44"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="45"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="46"/>
			<call arg="44"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="47"/>
			<enditerate/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="33" begin="5" end="8"/>
			<lve slot="1" name="33" begin="15" end="18"/>
			<lve slot="0" name="17" begin="0" end="19"/>
		</localvariabletable>
	</operation>
	<operation name="48">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="49"/>
			<push arg="49"/>
			<findme/>
			<push arg="50"/>
			<call arg="51"/>
			<iterate/>
			<store arg="19"/>
			<push arg="52"/>
			<push arg="52"/>
			<findme/>
			<push arg="53"/>
			<call arg="51"/>
			<iterate/>
			<store arg="29"/>
			<getasm/>
			<get arg="1"/>
			<push arg="54"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="43"/>
			<pcall arg="55"/>
			<dup/>
			<push arg="56"/>
			<load arg="19"/>
			<pcall arg="57"/>
			<dup/>
			<push arg="58"/>
			<load arg="29"/>
			<pcall arg="57"/>
			<dup/>
			<push arg="59"/>
			<push arg="60"/>
			<push arg="61"/>
			<new/>
			<pcall arg="62"/>
			<pusht/>
			<pcall arg="63"/>
			<enditerate/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="64" begin="30" end="35"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="56" begin="6" end="37"/>
			<lve slot="2" name="58" begin="13" end="38"/>
			<lve slot="0" name="17" begin="0" end="39"/>
		</localvariabletable>
	</operation>
	<operation name="65">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="66"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="56"/>
			<call arg="67"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="58"/>
			<call arg="67"/>
			<store arg="68"/>
			<load arg="19"/>
			<push arg="59"/>
			<call arg="69"/>
			<store arg="70"/>
			<load arg="70"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="38"/>
			<push arg="71"/>
			<call arg="72"/>
			<load arg="68"/>
			<get arg="38"/>
			<call arg="72"/>
			<call arg="30"/>
			<set arg="38"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<call arg="30"/>
			<set arg="73"/>
			<dup/>
			<getasm/>
			<load arg="68"/>
			<call arg="30"/>
			<set arg="74"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="75" begin="15" end="15"/>
			<lne id="76" begin="15" end="16"/>
			<lne id="77" begin="17" end="17"/>
			<lne id="78" begin="15" end="18"/>
			<lne id="79" begin="19" end="19"/>
			<lne id="80" begin="19" end="20"/>
			<lne id="81" begin="15" end="21"/>
			<lne id="82" begin="13" end="23"/>
			<lne id="83" begin="26" end="26"/>
			<lne id="84" begin="24" end="28"/>
			<lne id="85" begin="31" end="31"/>
			<lne id="86" begin="29" end="33"/>
			<lne id="64" begin="12" end="34"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="4" name="59" begin="11" end="34"/>
			<lve slot="2" name="56" begin="3" end="34"/>
			<lve slot="3" name="58" begin="7" end="34"/>
			<lve slot="0" name="17" begin="0" end="34"/>
			<lve slot="1" name="87" begin="0" end="34"/>
		</localvariabletable>
	</operation>
	<operation name="88">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="49"/>
			<push arg="49"/>
			<findme/>
			<push arg="50"/>
			<call arg="51"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="54"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="46"/>
			<pcall arg="55"/>
			<dup/>
			<push arg="56"/>
			<load arg="19"/>
			<pcall arg="57"/>
			<dup/>
			<push arg="59"/>
			<push arg="49"/>
			<push arg="61"/>
			<new/>
			<pcall arg="62"/>
			<pusht/>
			<pcall arg="63"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="89" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="56" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="90">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="66"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="56"/>
			<call arg="67"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="59"/>
			<call arg="69"/>
			<store arg="68"/>
			<load arg="68"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="89" begin="8" end="9"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="59" begin="7" end="9"/>
			<lve slot="2" name="56" begin="3" end="9"/>
			<lve slot="0" name="17" begin="0" end="9"/>
			<lve slot="1" name="87" begin="0" end="9"/>
		</localvariabletable>
	</operation>
</asm>
